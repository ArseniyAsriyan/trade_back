package com.trade_accounting.services.impl;

import com.trade_accounting.models.MovementProduct;
import com.trade_accounting.models.Product;
import com.trade_accounting.models.dto.MovementProductDto;
import com.trade_accounting.repositories.MovementProductRepository;
import com.trade_accounting.repositories.ProductRepository;
import com.trade_accounting.services.interfaces.MovementProductService;
import com.trade_accounting.utils.DtoMapper;
import com.trade_accounting.utils.mapper.MovementProductMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class MovementProductServiceImpl implements MovementProductService {

    private final MovementProductRepository movementProductRepository;
    private final ProductRepository productRepository;
    private final MovementProductMapper movementProductMapper;

    public MovementProductServiceImpl(MovementProductRepository movementProductRepository, ProductRepository productRepository, MovementProductMapper movementProductMapper) {
        this.movementProductRepository = movementProductRepository;
        this.productRepository = productRepository;
        this.movementProductMapper = movementProductMapper;
    }

    @Override
    public List<MovementProductDto> getAll() {
        return movementProductRepository.findAll().stream()
                .map(movementProductMapper::toMovementProductDto)
                .collect(Collectors.toList());
    }

    @Override
    public MovementProductDto getById(Long id) {
        Optional<MovementProduct> movementProduct = movementProductRepository.findById(id);
        return movementProductMapper.toMovementProductDto(movementProduct.orElse(new MovementProduct()));
    }

    @Override
    public MovementProductDto create(MovementProductDto dto) {
        return saveOrUpdate(dto);
    }

    @Override
    public MovementProductDto update(MovementProductDto dto) {
        return saveOrUpdate(dto);
    }

    @Override
    public void deleteById(Long id) {
        movementProductRepository.deleteById(id);
    }

    private MovementProductDto saveOrUpdate(MovementProductDto dto) {
        Optional<Product> product = productRepository.findById(dto.getProductId());
        MovementProduct movementProduct = movementProductMapper.toMovementProduct(dto);
        movementProduct.setProduct(product.orElse(null));

        return movementProductMapper.toMovementProductDto(movementProductRepository.save(movementProduct));
    }
}
