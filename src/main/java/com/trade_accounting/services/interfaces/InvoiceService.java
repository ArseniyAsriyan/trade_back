package com.trade_accounting.services.interfaces;

import com.trade_accounting.models.Invoice;
import com.trade_accounting.models.dto.InvoiceDto;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface InvoiceService {

    List<InvoiceDto> search(Specification<Invoice> specification);

    List<InvoiceDto> getAll();

    InvoiceDto getById(Long id);

    InvoiceDto create(InvoiceDto invoiceDto);

    InvoiceDto update(InvoiceDto invoiceDto);

    void deleteById(Long id);
}
