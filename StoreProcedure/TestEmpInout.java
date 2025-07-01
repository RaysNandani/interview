package StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class TestEmpInout {
	
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		  
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","root");
		
		CallableStatement callStmt = conn.prepareCall("(Call empInout (?,?))");
		
		callStmt.setInt(1, 1);
		
		callStmt.registerOutParameter(2,Types.INTEGER);
		
		callStmt.execute();
		
		System.out.println(callStmt.getInt(2));
	}

}




