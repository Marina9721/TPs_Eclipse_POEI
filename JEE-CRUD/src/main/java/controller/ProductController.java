package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Product;
import services.ProductService;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService service;

    public ProductController() {
        super();
        service = new ProductService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = -1;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		}catch(NumberFormatException e){	
		}
		
		String json="";
		response.setContentType("application/json");
		
		if(id!=-1) {
			json = new Gson().toJson(service.getProductById(id));
		}else {
			json = new Gson().toJson(service.getAllProduct().toArray());
		}

		response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		float price = Float.parseFloat(request.getParameter("price"));
		String brand = request.getParameter("brand");
		
		Product p = new Product(id, name, description, price, brand);
		service.createProduct(p);
		
		//doGet(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		float price = Float.parseFloat(request.getParameter("price"));
		String brand = request.getParameter("brand");
		
		Product p = new Product(id, name, description, price, brand);
		service.updateProduct(p);
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		service.deleteProduct(id);
	}

}
