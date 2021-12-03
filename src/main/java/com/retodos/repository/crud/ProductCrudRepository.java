/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.retodos.repository.crud;

import com.retodos.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author blink
 */
public interface ProductCrudRepository extends MongoRepository<Product, String> {
    
}
