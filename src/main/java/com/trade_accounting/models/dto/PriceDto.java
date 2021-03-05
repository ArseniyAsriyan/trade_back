package com.trade_accounting.models.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceDto {
    private Long id;
    private TypeOfPriceDto typeOfPriceDto;
    private BigDecimal value;

    public PriceDto(Long id, BigDecimal value) {
        this.id = id;
        this.value = value;
    }
}
