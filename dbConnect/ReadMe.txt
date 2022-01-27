/* how to connect and retrive data from mysql*/

create the java project in the eclipse
create class
download the jar file from "http://www.java2s.com/Code/Jar/m/Downloadmysqlconnectorjar.htm"
import it to java project (Built path->configure Built path-libraries->Add external jar files
start the xampp apache and mysql server
go to localhost in the browser->PhpAdmin create the database and table and add some data to table like username and password
write the below code to the java class
import java.sql.*;
public class MySqlConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con;
		Statement s;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/licence", "root","");
			
			s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from register");
			while(rs.next())
			{
					System.out.println(rs.getString("username")+ "\t" +rs.getString("password"));
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
