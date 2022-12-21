package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Empdatabase {

	public void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id =sc.nextInt();
		System.out.println("Enter Name");
		String nm=sc.next();
		System.out.println("Enter City");
		String ci=sc.next();
		System.out.println("Enter Email");
		String em=sc.next();
		System.out.println("Enter Salary");
		int sal=sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nimap", "root", "root");
			System.out.println("Connection is done");
			PreparedStatement ps=con.prepareStatement("insert into emp(id,name, city, email, salary)  values (?,?,?,?,?)");
			Employee obj=new Employee();
			obj.setId(id);
			obj.setName(nm);
			obj.setCity(ci);
			obj.setEmail(em);
			obj.setSalary(sal);
			ps.setInt(1, obj.getId());
			ps.setString(2, obj.getName());
			ps.setString(3, obj.getCity());
			ps.setString(4, obj.getEmail());
			ps.setInt(5, obj.getSalary());
			int i=ps.executeUpdate();
			if(i!=0)
			{
				System.out.println("Your data Has Been Stored");
			}
			else
			{
				System.out.println("Your data Not Stored");
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
