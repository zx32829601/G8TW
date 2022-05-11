import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Mysqlmanager {
	Connection con;
	public void connect() {
		
		
        
		try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/Condition?useSSL=false" ,"root","zxc12345");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from condition_info");
            
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
	public void Insert_Condition(int HR,double BO,String state,double lng,double lati) throws SQLException {
		String sql=String.format("insert into condition_info values(default,%d,%f,'%s',%f,%f)",HR,BO, state, lng, lati);
		System.out.println(sql);
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
        ps.executeUpdate();
		
	}
	}

	