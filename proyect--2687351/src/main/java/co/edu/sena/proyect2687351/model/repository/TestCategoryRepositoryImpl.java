package co.edu.sena.proyect2687351.model.repository;

import co.edu.sena.proyect2687351.model.bean.Category;

import java.sql.SQLException;

public class TestCategoryRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<Category> repository = (Repository<Category>) new CategoryRepositoryImpl();

        System.out.println("========== createObj Insert =========="); //insert
        Category categoryInsert = new Category();
        categoryInsert.setCategory_name("holaa3");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("holaaa3");
        repository.saveObj(categoryInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj Update ==========");
        Category categoryUpdate = new Category();
        categoryUpdate.setCategory_id(2);
        categoryUpdate.setCategory_name("cesar");
        repository.saveObj(categoryInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(3);
        repository.listAllObj().forEach(System.out::println);

    }
}
