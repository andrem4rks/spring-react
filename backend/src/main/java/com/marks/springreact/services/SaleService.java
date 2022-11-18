package com.marks.springreact.services;

import com.marks.springreact.model.Sale;
import com.marks.springreact.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

  @Autowired
  private SaleRepository saleRepository;

  public List<Sale> findSales() {
    return saleRepository.findAll();
  }
}
