package query;
import java.util.List;

import item.Item;

public interface QueryDAO {
	static final String getItemById = "SELECT * FROM PRODUCTS WHERE ID = ?";
	static final String getItemsCostingGreaterThan = "SELECT * FROM PRODUCTS WHERE PRICE > ?";
	static final String getItemsInStock = "SELECT * FROM PRODUCTS WHERE PRICE > ?";
	
	public Item getItemById(int itemId);
	public List<Item> getItemsCostingGreaterThan();
	public List<Item> getItemsInStock();
}
