package com.example.practice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product Management")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping(path = "/product/{id}")
    @Operation(summary = "Get a product with its id")
    public ResponseEntity<String> getProductById(@PathVariable Long id) {
        logger.info("Receive product get request: id = {}", id);
        // TODO add more function to query from database to get a product
        return ResponseEntity.ok().body("coffee");
    }

}
