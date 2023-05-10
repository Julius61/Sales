package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales,Long> {
}
