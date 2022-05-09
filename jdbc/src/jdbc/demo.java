package jdbc;
import java.sql.*;  

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydb","root","database");  
		
			
			Statement st = con.createStatement();
			
			String s = "insert into student(id,name)values('2','xyz')";
			
			st.execute(s);
			
			 
			}
		catch(Exception e)
		{ 
			System.out.println(e);
			} 
		
			}  
			
	}


