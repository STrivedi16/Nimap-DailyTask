package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Dept_Insert {
	Scanner scnr=new Scanner(System.in);
	public void setdept()
	{
		System.out.println("Enter Id");
		int  id=scnr.nextInt();
		System.out.println("Enter Department");
		String dept=scnr.next();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driverloaded");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimap","root","root");
			System.out.println("Connnection si sucessfull");
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into empdetails(empid,department) values(?,?) ");
			department department=new department();
			department.setId(id);
			department.setDepartm(dept);
			
			preparedStatement.setInt(1, department.getId());
			preparedStatement.setString(2, department.getDepartm());
			int i=preparedStatement.executeUpdate();
			if(i!=0)
			{
				System.out.println("Your data has been stored");
			}
			else
			{
				System.out.println("Your data not stored");
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
