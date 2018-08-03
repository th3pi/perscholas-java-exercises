package itemDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import item.Item;
import query.AbstractDAO;
import query.QueryDAO;

public class ItemDAO extends AbstractDAO implements QueryDAO {

	@SuppressWarnings("finally")
	@Override
	public Item getItemById(int itemId) {
		Item item = new Item();
		try {
			/*
			 * Checks for specific item using the item id
			 */
			super.connect();	//connects to database
			ps = conn.prepareStatement(QueryDAO.getItemById);	//the query
			ps.setInt(1, itemId);	//Where the query starts
			rs = ps.executeQuery();	
			
			//True when if statement find the item
			if(rs.next()) {
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setQis(rs.getInt(3));
				item.setPrice(rs.getDouble(4));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		/*
		 * Connection closes once the query is complete.
		 * And the returns the item found.
		 */
		finally{
			super.dispose();
			return item;
		}
	}

	@SuppressWarnings("finally")
	@Override
	public List<Item> getItemsCostingGreaterThan() {
		List<Item> items = new ArrayList<Item>();
		try {
			super.connect();
			ps = conn.prepareStatement(QueryDAO.getItemsCostingGreaterThan);
			ps.setDouble(1, 50);
			rs = ps.executeQuery();
			/*
			 * While loop keeps adding if it find items costing greater than the requirement
			 */
			while(rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setQis(rs.getInt(3));
				item.setPrice(rs.getDouble(4));
				items.add(item);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.dispose();
			return items;
		}
	}
	@SuppressWarnings("finally")
	@Override
	public List<Item> getItemsInStock() {
		List<Item> items = new ArrayList<Item>();
		try {
			super.connect();
			ps = conn.prepareStatement(QueryDAO.getItemsInStock);
			ps.setInt(1, 20);
			rs = ps.executeQuery();
			/*
			 * While loop keeps adding to the arraylist if it finds item quantity in stock greater than 
			 * requirement.
			 */
			while(rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setQis(rs.getInt(3));
				item.setPrice(rs.getDouble(4));
				items.add(item);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			super.dispose();
			return items;
		}
	}
	
}
