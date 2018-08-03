package main;
import query.*;

import java.util.ArrayList;
import java.util.List;

import item.*;
import itemDAO.*;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemDAO itemDAO = new ItemDAO();

//		
//		
//		Item item = new Item();
//		item = itemDAO.getItemById(3);
//		System.out.println(item.getName());
//		
//		
//		
//		
//		List<Item> itemsCostingGreater = new ArrayList<Item>();
//		itemsCostingGreater.addAll(itemDAO.getItemsCostingGreaterThan());
//		for(Item i : itemsCostingGreater) {
//			System.out.println(i.getName());
//		}
		
		List<Item> itemsInStock = new ArrayList<Item>();
		itemsInStock.addAll(itemDAO.getItemsInStock());
		for(Item i : itemsInStock) {
			System.out.println(i.getName());
		}
		
	}

}
