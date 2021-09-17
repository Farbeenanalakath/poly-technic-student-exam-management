/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polydetails;

import data.dbConnection;
import java.sql.*;
/**
 *
 * @author MY PC
 */
public class LoginHandler {
    public int insertLogindetails(LoginBean L1)
	{
	
	String StrQuery;
	
        String username;
        
	String password;
       
	
	int intResult=0;
	dbConnection db = new dbConnection() ;
       try
	{
	
		if(L1!=null)
		{
                   
                    username=L1.getusername();
                    password=L1.getpassword();
                    
			System.out.println("The username in handler page:"+username);
                    StrQuery="insert into tbl1_login(username,password) values ('"+username+"','"+password+"')"; 
			
                       // StrQuery=StrQuery + "'" + username + "',";
                       // StrQuery=StrQuery + "'" + password +"' )";
                        
                        
                      System.out.println(StrQuery);
			
	
	
		intResult=db.executeNonQuery(StrQuery);
			
	
	
		
		}
		
		
}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
			intResult=-1;
			}
	
	return intResult;
    
}
    
    
    
    
    
    
    public ResultSet success(String username,String password)
	{
	
	String StrQuery;
	ResultSet rsData=null;
	dbConnection db = new dbConnection() ;
	try
	{
		StrQuery="select * from tbl1_login where username='"+username+"' and password='"+password+"'";
		rsData=db.executeQuery(StrQuery);
                System.out.println(StrQuery);
		
	}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
		
			}
	
	return rsData;	
            
        }
}
