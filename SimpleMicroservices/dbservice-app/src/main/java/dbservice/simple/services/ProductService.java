/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbservice.simple.services;

import dbservice.simple.entities.Product;
import dbservice.simple.repos.ProductRepo;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;
    
    public List<Product> finds(){
        return productRepo.findAll();
    }
    
//    public List<Product> findAllById(String productId) {
//        return productRepo.findAllById(productId);
//    }
    
    public List<Product> findAllByIdandDate(String productId, Date transDate) {
        return productRepo.findAllByIdandDate(productId, transDate);
    }
    
    public List<Product> getAllSumStock(String productId, Date transDate, Integer stock) {
        return productRepo.getAllSumStock(productId, transDate, stock);
    }

    
}
