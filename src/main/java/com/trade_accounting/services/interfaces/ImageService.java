package com.trade_accounting.services.interfaces;

import com.trade_accounting.models.dto.ImageDto;

import java.util.List;

public interface ImageService {

    List<ImageDto> getAll();

    ImageDto getById(Long id);

    ImageDto create(ImageDto imageDto);

    ImageDto update(ImageDto imageDto);

    void deleteById(Long id);

    String saveImageToFile(byte[] content, String fileName);

    String getImageFromFile(String path);

    void deleteImageFile(String path);
}