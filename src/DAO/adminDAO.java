package DAO;		

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.adminBean;
import util.DBConnection;

public class adminDAO {
	
	 private final Connection con;
		
		public adminDAO()  throws ClassNotFoundException, SQLException {
			//System.out.println("hii shilpi in database");
	        con = DBConnection.getInstance().getConnection();   
	    }
		
		 public List<adminBean> getAllAdmin(){
		      List<adminBean> adminList =new ArrayList<adminBean>();
		      Statement stmt;
		      adminBean b;
		      try {
		        
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("select * from admin");
		         
		          while ( rs.next() ) 
		          {
		              b = new adminBean();
		              b.setAdmin_id(rs.getInt("admin_id"));
		              b.setEmail(rs.getString("email"));
		              b.setIsActive(rs.getInt("isActive"));
		              System.out.println("dao"+rs.getString("email"));
		              adminList.add( b );
		          }    
		    	  
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
		      return adminList;
		   }
		 int i=0;
		 public Boolean deleteAdmin(int id) {
				String sql = "UPDATE admin SET isActive=" + i + " WHERE admin_id = " + id + "; ";
		        int n=0;
		        try {
		            Statement stmt = con.createStatement();
		            n = stmt.executeUpdate( sql );
		        }
		        catch(SQLException e) {
		            System.out.println(e.getMessage());
		        }
		        return n>0;
			}
		 public List<adminBean> getAdminById(int id){
		      List<adminBean> adminList =new ArrayList<adminBean>();
		      Statement stmt;
		      adminBean b;
		      try {
		        
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("select * from admin where admin_id= " + id + "; ");
		         
		          while ( rs.next() ) 
		          {
		              b = new adminBean();
		              b.setAdmin_id(rs.getInt("admin_id"));
		              b.setEmail(rs.getString("email"));
		              b.setPassword(rs.getString("password"));
		              b.setIsActive(rs.getInt("isActive"));
		              System.out.println("dao"+rs.getString("email"));
		              adminList.add( b );
		          }    
		    	  
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
		      return adminList;
		   }
		 public int checkPassword(int id,String password){
		      //List<adminBean> adminList =new ArrayList<adminBean>();
		      Statement stmt;
		      int flag=0;
		     // adminBean b;
		      try {
		        
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("select * from admin where admin_id= " + id + " AND password='"+ password+ "'; ");
		         System.out.println(rs);
		          while ( rs.next() ) 
		          {
		              flag=1;
		             
		          }    
		    	  
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
		      
		      return flag;
		   }
}
