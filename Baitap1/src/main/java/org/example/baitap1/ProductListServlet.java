package org.example.baitap1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/productList")
public class ProductListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product A", "imageA.jpg", 100.0, 10));
        productList.add(new Product(2, "Product B", "imageB.jpg", 200.0, 20));
        productList.add(new Product(3, "Product C", "imageC.jpg", 300.0, 30));
        request.setAttribute("productList", productList);
        request.getRequestDispatcher("productList.jsp").forward(request, response);
    }
}

