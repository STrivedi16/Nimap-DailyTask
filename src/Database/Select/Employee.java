package Database.Select;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class Employee {

	public void select()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Employee Name :");
		String name=sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimap", "root", "root");
			System.out.println("connection is Sucessfull");
			
			PreparedStatement preparedStatement=connection.prepareStatement("select emp.name , emp.city , emp. salary , empdetails .department "
					+ " from emp join empdetails  "
					+ "on emp.id=empdetails.empid");
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
		while(resultSet.next())
		{
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString("city"));
			System.out.println(resultSet.getString("department"));
			
		}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
}
