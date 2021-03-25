package com.trade_accounting.repositories;

import com.trade_accounting.models.TypeOfContractor;
import com.trade_accounting.models.TypeOfPrice;
import com.trade_accounting.models.dto.TypeOfPriceDto;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypeOfPriceRepository extends JpaRepository<TypeOfPrice, Long> {

    Optional<TypeOfPrice> findByName(String name);

    @Query("select new com.trade_accounting.models.dto.TypeOfPriceDto(t.id, t.name, t.sortNumber) from TypeOfPrice t")
    List<TypeOfPriceDto> getAll();

    @Query("select new com.trade_accounting.models.dto.TypeOfPriceDto(t.id, " +
            "t.name, " +
            "t.sortNumber) " +
            "from TypeOfPrice t" +
            " where t.id = :id")
    TypeOfPriceDto getById(@Param("id") Long id);


    @Query("select new com.trade_accounting.models.dto.TypeOfPriceDto(" +
            "t.typeOfPrice.id, " +
            "t.typeOfPrice.name, " +
            "t.typeOfPrice.sortNumber) " +
            "from Contractor t " +
            "where t.id = :id")
    TypeOfPriceDto getTypeOfPriceByContractorId(@Param("id") Long id);

//    Optional<TypeOfPrice> getEntityName(String name);
//    JpaPersistentEntity<TypeOfPrice>,
}
