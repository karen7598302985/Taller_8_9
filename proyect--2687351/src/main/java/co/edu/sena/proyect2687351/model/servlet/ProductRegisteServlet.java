package co.edu.sena.proyect2687351.model.servlet;

import co.edu.sena.proyect2687351.model.bean.Product;
import co.edu.sena.proyect2687351.model.repository.ProductRepositoryimpl;
import co.edu.sena.proyect2687351.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class ProductRegisteServlet extends HttpServlet {
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  collect all form data
        String product_name = request.getParameter("product_name");
        String product_value = request.getParameter("product_value");
        String category_id = request.getParameter("category_id");
        //  fill it up in a User Bean
        Product product = new Product();
        product.setProduct_name(product_name);
        product.setProduct_value(Float.valueOf(product_value));
        product.setCategory_id(Integer.valueOf(category_id));
        // call repository layer and save the user object to DB
        Repository<Product> repository = new ProductRepositoryimpl();
        int rows = 0;
        try {
            repository.saveObj(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //todo prepare message for user about success
        //String message = null

        if(rows==0){
            System.out.println("Ocurrio un error");
        }else{
            System.out.println("Registro exitoso");
        }

        // todo write the message back to the page in client browser
        super.doDelete(request, response);
    }
}




