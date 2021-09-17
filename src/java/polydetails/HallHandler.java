/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polydetails;

import data.dbConnection;
import java.sql.ResultSet;

/**
 *
 * @author MY PC
 */
public class HallHandler {
    public int inserthalldetails(HallBean L1)
    {
    
	String StrQuery;
        int hnumber;
        int totalstudents;
	int intResult=0;
	dbConnection db = new dbConnection() ;
       try
	{
	
		if(L1!=null)
		{
                  
                    hnumber=L1.gethnumber();
                    totalstudents=L1.gettotalstudents();
                
                   
             StrQuery="insert into tbl_hallsetting(hall_no,maximum_student) values ('"+hnumber+"','"+totalstudents+"')";
                        //StrQuery=StrQuery + "'" + ename +"',";
                        //StrQuery=StrQuery + "'" + iname +"',";
                        //StrQuery=StrQuery + "'" + specialize+"',";
                        //StrQuery=StrQuery + "" + contactnumber+",";
                        //StrQuery=StrQuery + "'" + emailid+")" ;
                       
                        
                      System.out.println(StrQuery);
			
	
	
		intResult=db.executeNonQuery(StrQuery);
			
	
	
		
		}else{
                    System.out.println("Error in Insertion");
                }
		
		
}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
			intResult=-1;
			}
	
	return intResult;
    
}
     


    
}
