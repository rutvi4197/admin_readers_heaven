package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.adminBean;
import util.DBConnection;

public class loginDAO {
	
	 private final Connection con;
		
		public loginDAO()  throws ClassNotFoundException, SQLException {
			//System.out.println("hii shilpi in database");
	        con = DBConnection.getInstance().getConnection();   
	    }
		
		public adminBean checkLogin(String email,String password) {
			//System.out.println("hii shilpi in dao");
			Statement stmt;
			adminBean user=null;
			int n=0;
			 try {
			        String query="select * from admin where email= '"+email+"'and password='"+password+"' and isActive=1;";
			        System.out.println(query);
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery(query);
		          while(rs.next()) {
		        	n++;
		        	user=new adminBean();
		        	//System.out.println(rs.getString("name"));
		        	user.setAdmin_id(rs.getInt("admin_id"));
		          }
		          if(n==1)
		          {
		        	  return user;
		          }
		          
		          else {
		        	  return null;
		          }
		    	  
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
			return null;
		}
		public int addUser(String email,String password) {
			int n=0;
			int id=0;
			try {
				String query="insert into admin values(null,'"+email+"','"+password+"',1);";
			
				Statement stmt = con.createStatement();
				n = stmt.executeUpdate( query );
				
				
				
			}
			 catch(SQLException e) {
		            System.out.println(e.getMessage()+"jhfg");
		        }
			return n;
			
			
		}
		public int updateUser(int id,String email,String password) {
			int n=0;
			System.out.println(id+email+password);
			//int id=0;
			try {
				String query="update admin set email= '" + email + "' , password='" + password + "' where admin_id = " + id + " ; "; 
			
				Statement stmt = con.createStatement();
				n = stmt.executeUpdate( query );
				
				
				
			}
			 catch(SQLException e) {
		            System.out.println(e.getMessage());
		        }
			return n;
			
			
		}
		public int changePassword(int id,String password) {
			int n=0;
			System.out.println("id"+id);
			//int id=0;
			try {
				String query="update admin set password='" + password + "' where admin_id = " + id + "  "; 
			
				Statement stmt = con.createStatement();
				n = stmt.executeUpdate( query );
				
				
				
			}
			 catch(SQLException e) {
		            System.out.println(e.getMessage());
		        }
			return n;
			
			
		}

}
