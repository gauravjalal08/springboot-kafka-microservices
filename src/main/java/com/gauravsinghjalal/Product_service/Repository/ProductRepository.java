package com.gauravsinghjalal.Product_service.Repository;

import com.gauravsinghjalal.Product_service.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
