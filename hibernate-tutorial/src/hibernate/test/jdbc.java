package hibernate.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl="jdbc:mysql://localhost:3306/testdb?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user ="root";
        String pass ="";
		
		try {
			System.out.println("Connecting to database" +jdbcUrl);
			
			Connection myConn= DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Successfull!!! wujuu it worked!");
		}
		 
		catch (Exception exc){
			
			exc.printStackTrace();
			
		}		
	}

}
