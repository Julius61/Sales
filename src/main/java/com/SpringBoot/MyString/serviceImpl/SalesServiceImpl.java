package com.SpringBoot.MyString.serviceImpl;

import com.SpringBoot.MyString.entity.Sales;
import com.SpringBoot.MyString.repository.SalesRepository;
import com.SpringBoot.MyString.service.SalesService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class SalesServiceImpl implements SalesService {
    private SalesRepository salesRepository;
    @Override
    public Sales createSales(Sales sales) {
        return salesRepository.save(sales);
    }

    @Override
    public Sales getSalesById(Long salesId) {
        Optional<Sales> optionalSales=salesRepository.findById(salesId);
        return optionalSales.get();
    }

    @Override
    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    @Override
    public Sales updateSales(Sales sales) {
        Sales mySales=salesRepository.findById(sales.getId()).get();
        mySales.setName(sales.getName());
        mySales.setEmail(sales.getEmail());
        Sales updatedSales=salesRepository.save(sales);
        return updatedSales;
    }

    @Override
    public void deleteSales(Long salesId) {

    }
}
