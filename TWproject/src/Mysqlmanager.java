import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Mysqlmanager {
	
	public static void connect() {
        String sql="insert into condition_info values(default,102,98.3,'abnormal',40.123456789,39.12345678)";

		try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/Condition?useSSL=false" ,"root","zxc12345");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from condition_info");
            PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
            ps.executeUpdate();
            while(rs.next()) {
                System.out.println(rs.getString("Time"));	

            }
            System.out.println("Connected");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
	}

	