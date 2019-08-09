package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import utilities.FileHandler;

/**
 * Servlet implementation class ItemAddServlet
 */
@WebServlet("/ItemAdd")
public class ItemAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double price;
		int quantity;
		
		try {
			price = Double.parseDouble(request.getParameter("itemPrice"));
			quantity = Integer.parseInt(request.getParameter("itemQuantity"));
		}catch (Exception e){
			System.out.println("Item price or quantity invalid: " + e.getMessage());
			return;
		}
		
		Item item = new Item();
		
		item.setName(request.getParameter("itemName"));		
		item.setPrice(price);
		item.setQuantity(quantity);
		item.setDescription(request.getParameter("itemDescription"));
		
		if(FileHandler.WriteNewItemToFile(item) == false)
		{
			System.out.println("Failed to add new item to file: " + item.getName());
			return;
		}
		else
		{
			System.out.println("Item added: " + item.toString());					
		}
	}
	

}
