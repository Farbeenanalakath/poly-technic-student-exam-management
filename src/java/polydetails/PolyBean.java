/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polydetails;

/**
 *
 * @author MY PC
 */
public class PolyBean {
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
        public int gettnumber()
	{
		return (this.tnumber);
	}
	public void settnumber(int tnumber)
	{
		this.tnumber=tnumber;
	}
         public int getpolynumber()
	{
		return (this.polynumber);
	}
	public void setpolynumber(int polynumber)
	{
		this.polynumber=polynumber;
               
	}
         public String getpolyname()
	{
		return (this.polyname);
	}
	public void setpolyname(String polyname)
	{
		this.polyname=polyname;
	}
         public String getaddress()
	{
		return (this.address);
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
         public int getcontactnumber()
	{
		return (this.contactnumber);
	}
	public void setcontactnumber(int contactnumber)
	{
		this.contactnumber=contactnumber;
	}
         public String getemilid()
	{
		return (this.emailid);
	}
	public void setemailid(String emailid)
	{
		this.emailid=emailid;
	}
          public String getprincipalname()
	{
		return (this.principalname);
	}
	public void setprincipalname(String principalname)
	{
		this.principalname=principalname;
	}
          public String getbranch()
	{
		return (this.branch);
	}
	public void setbranch(String branch)
	{
		this.branch=branch;
	}
         public int gettotalstaff()
	{
		return (this.totalstaff);
	}
	public void settotalstaff(int totalstaff)
	{
		this.totalstaff=totalstaff;
	}
         public int gettotalstudents()
	{
		return (this.totalstudents);
	}
	public void settotalstudents(int totalstudents)
	{
		this.totalstudents=totalstudents;
	}
	
    
}
