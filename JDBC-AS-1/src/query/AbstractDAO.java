package query;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class AbstractDAO {
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user = "tanjim";
	private final String pass = "password";
	private final Driver driver = new oracle.jdbc.driver.OracleDriver();
	
	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	public void connect(){
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dispose() {
		try {
			if(!rs.equals(null)) {
				if(!rs.isClosed()) rs.close();
			}
			if(ps.equals(null)) {
				if(!rs.isClosed()) ps.close();
			}
			if(!conn.equals(null)) {
				if(!conn.isClosed()) conn.close();
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
