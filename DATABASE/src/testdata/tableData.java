package testdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import settings.Settings;

public class tableData {
	
	Settings se=new Settings();

    public static tableData facebook;
    Connection connection = null;
public static tableData getInstance() throws Exception {
   	 try {

   		 if (facebook == null) {
   			 facebook = new tableData();
   		 }

   	 } catch (Exception e) {
   		 throw new Exception("Exception while Initializing TestUtil.", e);
   	 }
   	 return facebook;
    }


    public String[] retrieveDBValue(String dataPool) throws Exception {
   	 Connection conn = null;
   	 Statement stmt = null;
    
   	 String id=null;
   	 String text = null;
   	 String[] arr = new String[2];

try{
   		 
   		 // get the property value
   		 String DB_URL = se.getProperty("DB_URL_CATS");
   		 String USER = se.getProperty("USER1");
   		 String PASS = se.getProperty("PASS1");

   		 Class.forName("com.mysql.jdbc.Driver");
   		 
   		 System.out.println("Connecting to database...");
   		 conn = DriverManager.getConnection(DB_URL,USER,PASS);
   		 
   		 System.out.println("Creating statement...");
   		 stmt = conn.createStatement();
   		 
   		 String query = "select * from facebook where id='" + dataPool + "'";
   		 System.out.println(query);
   		 //datable is the table name
   		 ResultSet rs = stmt.executeQuery(query);
   		 System.out.println("rs===="+rs);
   		 while (rs.next()) {
   			 id = rs.getObject(2).toString();
   			 System.out.println(id);
   			 text = rs.getObject(3).toString();
   			 System.out.println(text);
   			 arr[0] = id;
   			 arr[1] = text;
   			 
   			 conn.close();
   		}}catch(SQLException se){
   		 //     se.printStackTrace();
   		 }catch (Exception ex) {
   			 ex.printStackTrace();
   		 }   		 
   	 return arr;
    }	   




}
