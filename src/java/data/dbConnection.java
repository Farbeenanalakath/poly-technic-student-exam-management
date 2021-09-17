/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;

/**
 *
 * @author MY PC
 */
public class dbConnection {
    public static String DBDriver = "";

	public static String DBUrl = "";

	public static String DBUser = "";

	public static String DBPassword = "";
	public Connection con;
        static
        {
            
            try{
                DBDriver = "com.mysql.jdbc.Driver";
			DBUrl = "jdbc:mysql://127.0.0.1:3306/test?autoReconnect=true";
			DBUser = "root";
			DBPassword = "";
					Class.forName(DBDriver);
					
            
                }
            catch (Exception er){
                                System.out.println("ERROR [Driver loading Error] : " + er);
                                }
    
}
        public void getConnection(){
            try
		{
		
		con = DriverManager.getConnection(DBUrl, DBUser,
				DBPassword);
		System.out.println("Connection Ok");
		
		}
		catch(Exception er)
		
		{
			System.out.println("ERROR [Connection error] : " + er);	
			
		
		}
            
                                    }
        public int executeNonQuery(String strQuery){
            int intResult=0;
            try{ 
                                getConnection();
				Statement stmt=con.createStatement();
				//System.out.println("Statement Ok");
				
				intResult=stmt.executeUpdate(strQuery);
				}
            catch(Exception e1)
				{
					System.out.println("Exception is:" + e1.getMessage());
				}
				
				return intResult;
                                
            
            }
        public ResultSet executeQuery(String strQuery){
            ResultSet rsData=null;
            try{
                getConnection();
			Statement stmt = con.createStatement();
			rsData=stmt.executeQuery(strQuery);
            }
            catch(Exception e){
                System.out.println("Exception is:" + e.getMessage());	
            }
                return rsData;
            }
            
                      }
        
        
        

