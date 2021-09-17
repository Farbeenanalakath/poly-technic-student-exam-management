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
public class ExternalHandler {
    public int externaldetails(ExternalBean L1)
	{
	
	String StrQuery;
	String ename;
        
	String iname;
       
	
        String specialize;
        
       
        int contactnumber;
        String emailid;
	int intResult=0;
	dbConnection db = new dbConnection() ;
       try
	{
	
		if(L1!=null)
		{
                  
                    ename=L1.getename();
                    iname=L1.getiname();
                    specialize=L1.getspecialize();
                    contactnumber=L1.getcontactnumber();
                    emailid=L1.getemilid();
                   
                    StrQuery="insert into tbl_external(externalname,institution,specialise,e_mailid,contact_no) values ('"+ename+"','"+iname+"','"+specialize+"','"+contactnumber+"','"+emailid+"')";
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
    
} public ResultSet getid()
	{
	
	String StrQuery;
	ResultSet rsData=null;
	dbConnection db = new dbConnection() ;
	try
	{
		StrQuery="select * from tbl_external";
		rsData=db.executeQuery(StrQuery);
		
	}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
		
			}
	
	return rsData;	
            
        }
	public ResultSet getvalues(String specialize)
	{
	
	String StrQuery;
	ResultSet rsData=null;
	dbConnection db = new dbConnection() ;
	try
	{
		StrQuery="select * from tbl_external where specialice='"+specialize+"'" ;
		rsData=db.executeQuery(StrQuery);
               
	}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
		
			}
	
	return rsData;	
            
        }
        public int updateStudent(ExternalBean s1)
		{
		
		String StrQuery;
	String ename;
        
	String iname;
       
	
        String specialize;
        
       
        int contactnumber;
        String emailid;
	int intResult=0;
		dbConnection db = new dbConnection() ;
		try
		{
		
			if(s1!=null)
			{
				
				
	
                            
                            ename = s1.getename();
                            iname=s1.getiname();
                            specialize=s1.getspecialize();
                            contactnumber=s1.getcontactnumber();
                            emailid=s1.getemilid();
                            
                            
                            
				
				
				
				StrQuery="update tbl_external set " ;
                                
                                StrQuery=StrQuery + "externalname ='" + ename + "',";
                       StrQuery=StrQuery + "institution ='" + iname + "',";
                        StrQuery=StrQuery + "specialise =" + specialize + ",";
                        StrQuery=StrQuery + "contact_no =" +  contactnumber + ",";
                       StrQuery=StrQuery + "e_mailid ='" + emailid + "',";
                        
                        StrQuery=StrQuery + " Where specialise =" + specialize+"";
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
    
}
