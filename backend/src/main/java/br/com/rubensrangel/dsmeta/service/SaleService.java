package br.com.rubensrangel.dsmeta.service;

import br.com.rubensrangel.dsmeta.entities.Sale;
import br.com.rubensrangel.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return   repository.findAll();
    }
}
