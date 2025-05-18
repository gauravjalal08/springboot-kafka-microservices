package com.gauravsinghjalal.Product_service.Controller;

import com.gauravsinghjalal.Product_service.Dto.ProductRequest;
import com.gauravsinghjalal.Product_service.Dto.ProductResponse;
import com.gauravsinghjalal.Product_service.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.CreateProduct(productRequest);

    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct(){
        return productService.getAllProduct();
    }

}
