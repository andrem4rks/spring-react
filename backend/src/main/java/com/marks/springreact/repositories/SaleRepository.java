package com.marks.springreact.repositories;

import com.marks.springreact.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository <Sale, Long> {
}
