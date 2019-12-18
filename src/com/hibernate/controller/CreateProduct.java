package com.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Product;

/**
 * Servlet implementation class CreateProduct
 */
@WebServlet("/CreateProduct")
public class CreateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output = response.getWriter();
		
		Product myProduct =  new Product();
		myProduct.setProductName(request.getParameter("txtNameProduct"));
		myProduct.setProductPrice(Double.parseDouble(request.getParameter("txtProductPrice")));
		
		//Configuration object
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		//Session Factory Creation
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		//Open Session
		Session session = sessionfactory.openSession();
		
		//Initiate Request
		Transaction t = session.beginTransaction();
		
		//Persistence
			//CRUD - Create
		session.persist(myProduct);
		
		//Close connection
		session.close();
		
		
		output.close();
	}

}
