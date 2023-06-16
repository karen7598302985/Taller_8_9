package co.edu.sena.proyect2687351.model.repository;

import co.edu.sena.proyect2687351.model.bean.Product;

import java.sql.SQLException;

public class TestProductRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<Product> repository = (Repository<Product>) new ProductRepositoryimpl();

        System.out.println("========== createObj Insert =========="); //insert
        Product productInsert = new Product();
        productInsert.setProduct_name("juan");
        productInsert.setProduct_value(20.000F);
        productInsert.setCategory_id(10);
        repository.saveObj(productInsert);
        productInsert.setProduct_name("holaa3");
        productInsert.setProduct_value(40.000F);
        productInsert.setCategory_id(8);
        repository.saveObj(productInsert);

    }
}
