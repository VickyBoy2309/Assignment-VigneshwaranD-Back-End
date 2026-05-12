package task1.task1.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import task1.task1.productservice.model.Product;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {

        return Arrays.asList(

                new Product(
                        1,
                        "Laptop",
                        72000,
                        "/images/ASUS_TUF_A15.jpg"),

                new Product(
                        2,
                        "Mobile",
                        25000,
                        "/images/VIVO_T2X_5G.jpg"),

                new Product(
                        3,
                        "Headphones",
                        3600,
                        "/images/Boat_Airdopes_800.jpg"));
    }
}