package dataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTesting {
	
	// Connection -> Create connection between DB and Selenium
	// Driver Manager ----> Provide Connection
	//Statement ----> Execute SQL Commands
	// ResultSet -> Final Output -----> SELECT * FROM TABLENAME

	public static void main(String[] args) throws SQLException {


		// Step1: Create object of connection class
		Connection c = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/testing_squad", "sonali_admin", "sonali123");
		
		//Step 2: Create object of Statement class
		Statement s= c.createStatement();
		
		// INSERT DATA ---> INSERT(DML)
		//s.execute("INSERT INTO Testing VALUES (101, 'sonali')");
//		s.execute("INSERT INTO Testing VALUES (102, 'Alice')");
//		s.execute("INSERT INTO Testing VALUES (103, 'john')");
//		s.execute("INSERT INTO Testing VALUES (104, 'liaz')");
//		s.execute("INSERT INTO Testing VALUES (105, 'lee')");
		
		//ADD coloumn -> ALTER (DDL)
	//	s.execute("ALTER TABLE Testing ADD Location CHARACTER (100)");
		//s.execute("ALTER TABLE Testing ADD Marks VARCHAR (10)");
		
		//UPDATE LOCATION -----> UPDATE (DDL)
//		s.execute("UPDATE Testing SET Location = 'India' WHERE ID=101");
//		s.execute("UPDATE Testing SET Location = 'USA' WHERE ID=102");
//		s.execute("UPDATE Testing SET Location = 'UK' WHERE ID=103");
//		s.execute("UPDATE Testing SET Location = 'Paris' WHERE ID=104");
//		s.execute("UPDATE Testing SET Location = 'America' WHERE ID=105");

		// CHANGE COLUMN NAME ---> ALTER(DDL)
	//	s.execute("ALTER TABLE Testing CHANGE Location ADDRESS CHARACTER(50)");
		
		//DELETE COLUMN -------> ALTER (DDL)
	//	s.execute("ALTER TABLE Testing DROP COLUMN Marks");
		
		// DELETE ROW ----> ALTER(DDL)
		//s.execute("DELETE FROM Testing WHERE ID=102");
		
		//RENAME TABLE NAME------> RENAME (DDL)
		//s.execute("RENAME TABLE TESTING TO TESTING_SONALI");
		
		// TRUNCATE (DDL) ----> delete whole data 
	//	s.execute("TRUNCATE TABLE TESTING_SONALI");
		
		// DELETE STRUCTURE OF TABLE ----> DROP(DDL)
		//s.execute("DROP TABLE TESTING");
		
		
		// Step 3: Create object of ResultSet
		ResultSet rs=s.executeQuery("SELECT * FROM TESTING_SONALI ORDER BY ID");
		
		
		// Step 4: Loop
		while(rs.next()==true)
		{
			int id=rs.getInt(1);
			String name = rs.getString(2);
			//String loc= rs.getString(3);
			
			System.out.println(id + "\t\t"+ name );
			
		}
		
	}

}
