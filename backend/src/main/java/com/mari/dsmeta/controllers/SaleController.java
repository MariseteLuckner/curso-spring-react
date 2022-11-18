package com.mari.dsmeta.controllers;

import com.mari.dsmeta.entities.Sale;
import com.mari.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    public SaleService service;

    @GetMapping
    public List<Sale> findSales() {
        return service.findSales();
    }
}
