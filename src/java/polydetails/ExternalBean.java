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
public class ExternalBean {
    
        String ename;
        
	String iname;
       
	
        String specialize;
        
       
        int contactnumber;
        String emailid;
        public String getename()
	{
		return (this.ename);
	}
	public void setename(String ename)
	{
		this.ename=ename;
	}
        
         public String getiname()
	{
		return (this.iname);
	}
	public void setiname(String iname)
	{
		this.iname=iname;
	}
         public String getspecialize()
	{
		return (this.specialize);
	}
	public void setspecialize(String specialize)
	{
		this.specialize=specialize;
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
         
	
    
}
