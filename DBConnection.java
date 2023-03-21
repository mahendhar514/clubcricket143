package scoresheet;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
private static Connection con; 
private DBConnection() {} static
{
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection
			("jdbc:mysql://183.16.7.49:3306/score","admin","12345678");
	}catch(Exception e) 
	{e.printStackTrace();}
	}//end of block
	public static Connection getCon() { 
	return con;
}
}
