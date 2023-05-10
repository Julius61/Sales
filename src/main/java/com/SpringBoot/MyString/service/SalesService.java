package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.Sales;

import java.util.List;

public interface SalesService {
    Sales createSales(Sales sales);
    Sales getSalesById(Long salesId);
    List<Sales> getAllSales();
    Sales updateSales(Sales sales);
    void deleteSales(Long salesId);
}
