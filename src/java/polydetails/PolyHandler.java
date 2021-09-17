/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polydetails;
import data.dbConnection;
import polydetails.PolyBean;
import java.sql.*;


/**
 *
 * @author MY PC
 */
public class PolyHandler {
    
	public int insertpolydetails(PolyBean L1)
	{
	
	String StrQuery;
	int tnumber;
        int polynumber;
        String polyname;
        
	String address;
       
	int contactnumber;
        String emailid;
        String principalname;
        String branch;
        int totalstaff;
        int totalstudents;
	int intResult=0;
	dbConnection db = new dbConnection() ;
       try
	{
	
		if(L1!=null)
		{
                   tnumber= L1.gettnumber();
                    polynumber=L1.getpolynumber();
                    polyname=L1.getpolyname();
                    address=L1.getaddress();
                    contactnumber=L1.getcontactnumber();
                    emailid=L1.getemilid();
                    principalname=L1.getprincipalname();
                    branch=L1.getbranch();
                    totalstaff=L1.gettotalstaff();
                    totalstudents=L1.gettotalstudents();
			
                    StrQuery="insert into tbl_polydetails(T_no,poly_no,poly,address,contact_no,e_mailid,principal,branch,total_staff,total_student) values(" ;
			StrQuery=StrQuery + tnumber + ",";
                        StrQuery=StrQuery + polynumber + ",";
                        StrQuery=StrQuery + "'" + polyname + "',";
                        StrQuery=StrQuery + "'" + address +"',";
                        StrQuery=StrQuery + "" + contactnumber+",";
                        StrQuery=StrQuery + "'" + emailid+"',";
                        StrQuery=StrQuery + "'" + principalname+"',";
                        StrQuery=StrQuery + "" + branch+",";
                        StrQuery=StrQuery + totalstaff+",";
                        StrQuery=StrQuery + totalstudents+")";
                        
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
	/////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////
		public ResultSet getvalues(int tnumber)
	{
	
	String StrQuery;
	ResultSet rsData=null;
	dbConnection db = new dbConnection() ;
	try
	{
		StrQuery="select * from tbl_polydetails where poly_no='"+tnumber+"'" ;
		rsData=db.executeQuery(StrQuery);
                System.out.println(StrQuery);
		
	}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
		
			}
	
	return rsData;	
            
        }
                
                
                //////////////////////////////////////////////////////////////////////////////
                public ResultSet getid()
	{
	
	String StrQuery;
	ResultSet rsData=null;
	dbConnection db = new dbConnection() ;
	try
	{
		StrQuery="select * from tbl_polydetails";
		rsData=db.executeQuery(StrQuery);
		
	}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
		
			}
	
	return rsData;	
            
        }
                
                /////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////
                public ResultSet getvalues()
	{
	
	String StrQuery;
	ResultSet rsData=null;
	dbConnection db = new dbConnection() ;
	try
	{
		StrQuery="select * from tbl_polydetails";
		rsData=db.executeQuery(StrQuery);
		
	}
	catch(Exception e2)
			{
			System.out.println("ERROR [Connection error] : " + e2.getMessage());
		
			}
	
	return rsData;	
            
        }
                
                
                
                
                
                	public int updateStudent(PolyBean s1)
		{
		
		String StrQuery;
	int tnumber;
        int polynumber;
        String polyname;
        
	String address;
       
	int contactnumber;
        String emailid;
        String principalname;
        String branch;
        int totalstaff;
        int totalstudents;
	int intResult=0;
		dbConnection db = new dbConnection() ;
		try
		{
		
			if(s1!=null)
			{
				
				tnumber = s1.gettnumber();
				polynumber=s1.getpolynumber();
				polyname=s1.getpolyname();
				address=s1.getaddress();
				contactnumber=s1.getcontactnumber();
                                emailid = s1.getemilid();
				principalname=s1.getprincipalname();
				branch=s1.getbranch();
				totalstaff=s1.gettotalstaff();
				totalstudents=s1.gettotalstudents();
				
				
				
				
			
		
				StrQuery="update tbl_polydetails set " ;
                                StrQuery=StrQuery + "T_no =" +  tnumber + ",";
                                StrQuery=StrQuery + "poly ='" + polyname + "',";
                       StrQuery=StrQuery + "address ='" + address + "',";
                        StrQuery=StrQuery + "contact_no =" +  contactnumber + ",";
                       StrQuery=StrQuery + "e_mailid ='" + emailid + "',";
                        StrQuery=StrQuery + "principal ='" + principalname + "',";
                     StrQuery=StrQuery + "branch =" + branch + ",";
                        StrQuery=StrQuery + "total_staff =" +  totalstaff + ",";
                       StrQuery=StrQuery + "total_student =" +  totalstudents+ "";
                        StrQuery=StrQuery + " Where poly_no =" + polynumber+"";
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
        //*************************************************//
	// to delete the poly details from  the table
//*************************************************//
		
		public int deletePolyDetails(int PolyID)
		{
		
		String StrQuery="";
	    int intResult=0;
		dbConnection db = new dbConnection() ;
		try
		{
				StrQuery="delete from tbl_polydetails where poly_no='"+PolyID+"'" ;
				intResult=db.executeNonQuery(StrQuery);
	}
		catch(Exception e2)
				{
				System.out.println("ERROR [Connection error] : " + e2.getMessage());
				intResult=-1;
				}
		
	
		
	return intResult;

		}                
}
        
    
    


