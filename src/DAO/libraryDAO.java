package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.library_joinBean;
import util.DBConnection;

public class libraryDAO {
	 private final Connection con;
	 public libraryDAO()  throws ClassNotFoundException, SQLException {
	        con = DBConnection.getInstance().getConnection();   
	    }
		
		  public List<library_joinBean> getAllLibrary(){
		      List<library_joinBean> libraryList =new ArrayList<library_joinBean>();
		      Statement stmt;
		      library_joinBean b;
		      try {
		        
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("SELECT * FROM `library_address` as la, `library` as l WHERE la.library_id=l.library_id and la.library_status=1");
		         
		          while ( rs.next() ) 
		          {
		              b = new library_joinBean();
		              b.setLibrary_id(rs.getInt("library_id"));
		              b.setLibrary_address_id(rs.getInt("library_address_id"));
		              b.setLibrary_name(rs.getString("library_name"));
		              b.setBranch_name(rs.getString("branch_name"));
		              b.setBranch_address(rs.getString("branch_address"));
		              b.setContact_no(rs.getString("contact_no"));
		              b.setPincode(rs.getInt("pincode"));
		              b.setEmail(rs.getString("email"));
		              System.out.println("dao"+rs.getString("library_name"));
		              libraryList.add( b );
		          }    
		    	  
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
		      return libraryList;
	   }
		  public int addLibrary(String name) {
				int n=0;
				int id=0;
				try {
					String query="insert into library values(null,'"+name+"');";
				
					Statement stmt = con.createStatement();
					n = stmt.executeUpdate( query );
					
					String select="select library_id from library order by library_id desc limit 1";
					ResultSet rs = stmt.executeQuery( select );
					while(rs.next())
					id=rs.getInt("library_id");
					
				}
				 catch(SQLException e) {
			            System.out.println(e.getMessage());
			        }
				return id;
				
				
			}
		  public Boolean addLibraryAddress(String branch_name,int library_id,String branch_address,String contact_no,int pincode,int total_bill,double lot,double lat,String email,String password,int library_status) {
				int n=0;
				
				try {
					
					String query="insert into library_address values(null,'"+branch_name+"',"+library_id+",'"+branch_address+"','"+contact_no+"',"+pincode+","+total_bill+","+lot+","+lat+",'"+email+"','"+password+"',"+library_status+");";
						
					Statement stmt = con.createStatement();
					n = stmt.executeUpdate( query );
					
				}
				 catch(SQLException e) {
					    System.out.println("insert into user_address values(null,'"+branch_name+"',"+library_id+",'"+branch_address+"','"+contact_no+"',"+pincode+","+total_bill+","+lot+","+lat+",'"+email+"','"+password+"',"+library_status+");");
			            System.out.println(e.getMessage());
			        }
				return n>0;
			}

		  public List<library_joinBean> getLibrary(int library_address_id){
		      List<library_joinBean> libraryList =new ArrayList<library_joinBean>();
		      Statement stmt;
		      library_joinBean b;
		      try {
		        
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("SELECT * FROM `library_address` as la, `library` as l WHERE la.library_id=l.library_id and la.library_status=1 and la.library_address_id="+library_address_id);
		         
		          while ( rs.next() ) 
		          {
		              b = new library_joinBean();
		              b.setLibrary_id(rs.getInt("library_id"));
		              b.setLibrary_address_id(rs.getInt("library_address_id"));
		              b.setLibrary_name(rs.getString("library_name"));
		              b.setBranch_name(rs.getString("branch_name"));
		              b.setBranch_address(rs.getString("branch_address"));
		              b.setContact_no(rs.getString("contact_no"));
		              b.setPincode(rs.getInt("pincode"));
		              b.setEmail(rs.getString("email"));
		              b.setTotal_bill(rs.getInt("total_bill"));
		              b.setLatitude(rs.getDouble("latitude"));
		              b.setLibrary_status(rs.getInt("library_status"));
		              System.out.println("dao"+rs.getString("library_name"));
		              libraryList.add( b );
		          }    
		    	  
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
		      return libraryList;
	   }
		  
		  public Boolean updateLibraryAddress(String library_name,int library_address_id,String branch_name,String branch_address,String contact_no,int pincode,String email) {
				int n=0;
				
				try {
				
					Statement stmt2 = con.createStatement();        
			          ResultSet rs2 = stmt2.executeQuery("SELECT * FROM `library_address` as la, `library` as l WHERE la.library_id=l.library_id and la.library_status=1 and la.library_address_id="+library_address_id);
			         int id=0;
			          while ( rs2.next() ) 
			          {
			              id=rs2.getInt("library_id");
			              
			              
			          }
					
					String query="UPDATE  `library` SET library_name='"+library_name+"' where library_id="+id;
					
					Statement stmt = con.createStatement();
					n = stmt.executeUpdate( query );
				
					String query1="UPDATE library_address SET branch_name='"+branch_name+"',branch_address='"+branch_address+"',contact_no='"+contact_no+"',pincode="+pincode+",email='"+email+"' WHERE library_address_id="+library_address_id;
					System.out.println(query1);
						
					Statement stmt1 = con.createStatement();
					n = stmt1.executeUpdate( query1 );
					
				}
				 catch(SQLException e) {
					
			            System.out.println(e.getMessage());
			        }
				return n>0;
			}


		  
		  
}
