package com.SpringBoot.MyString.controller;

import com.SpringBoot.MyString.entity.Sales;
import com.SpringBoot.MyString.service.SalesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/sales")
@RestController
@AllArgsConstructor
public class SalesController {
    private SalesService salesService;

    //create sales
    //Http://locahost:8080/api/sales/1
    @PostMapping
    public ResponseEntity<Sales> createSales(@RequestBody Sales sales){
        Sales sales1=salesService.createSales(sales);
        return new ResponseEntity<>(sales1, HttpStatus.CREATED);
    }
    //create get sales by id
    @GetMapping
    public ResponseEntity<Sales> getSalesById(@PathVariable("id") Long salesId){
        Sales sales2=salesService.getSalesById(salesId);
        return new ResponseEntity<>(sales2,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Sales>> getAllSales(){
        List<Sales> sales3=salesService.getAllSales();
        return new ResponseEntity<>(sales3,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Sales> updateSales(@RequestBody Sales sales,@PathVariable("id") Long salesId){
        sales.setId(salesId);
        Sales sales4=salesService.updateSales(sales);
        return new ResponseEntity<>(sales4,HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteSales(@PathVariable("id") Long salesId){
        salesService.deleteSales(salesId);
        return new ResponseEntity<>("Sales deleted successfully",HttpStatus.OK);
    }
}
