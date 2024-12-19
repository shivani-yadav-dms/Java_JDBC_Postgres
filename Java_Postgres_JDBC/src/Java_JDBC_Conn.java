import java.sql.*;
public class Java_JDBC_Conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery("select * from student");
        	while(rs.next()) {
        		System.out.println(rs.getString("stud_id")+"  "+rs.getString("admin_id"));
        	}
        	
        	con.close();
        }
        catch(Exception e){
        	System.out.println(e);
        }
	}

}
