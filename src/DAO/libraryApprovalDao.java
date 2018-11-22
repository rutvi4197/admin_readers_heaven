package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.library_joinBean;
import util.DBConnection;

public class libraryApprovalDao {
	private final Connection con;
	
	public libraryApprovalDao()  throws ClassNotFoundException, SQLException {
		System.out.println("In database");
        con = DBConnection.getInstance().getConnection();   
    }
	
	  public List<library_joinBean> getAllLibrary(){
	      List<library_joinBean> libraryList =new ArrayList<library_joinBean>();
	      Statement stmt;
	      library_joinBean b;
	      try {
	        
	    	  stmt = con.createStatement();        
	          ResultSet rs = stmt.executeQuery("SELECT * FROM `library_address` as la, `library` as l WHERE la.library_id=l.library_id and la.library_status=0");
	         
	          while ( rs.next() ) 
	          {
	              b = new library_joinBean();
	              b.setLibrary_id(rs.getInt("library_id"));
	              b.setLibrary_name(rs.getString("library_name"));
	              b.setBranch_name(rs.getString("branch_name"));
	              b.setLibrary_address_id(rs.getInt("library_address_id"));
	              System.out.println("dao"+rs.getString("library_name"));
	              libraryList.add( b );
	          }    
	    	  
	      }  catch(SQLException e) {
	          System.out.println("dao"+e);
	      }
	      return libraryList;
	   }
	  
	  public List<library_joinBean> getDisapproveLibrary(){
	      List<library_joinBean> libraryList =new ArrayList<library_joinBean>();
	      Statement stmt;
	      library_joinBean b;
	      try {
	        
	    	  stmt = con.createStatement();        
	          ResultSet rs = stmt.executeQuery("SELECT * FROM `library_address` as la, `library` as l WHERE la.library_id=l.library_id and la.library_status=2");
	         
	          while ( rs.next() ) 
	          {
	              b = new library_joinBean();
	              b.setLibrary_id(rs.getInt("library_id"));
	              b.setLibrary_name(rs.getString("library_name"));
	              b.setBranch_name(rs.getString("branch_name"));
	              b.setLibrary_address_id(rs.getInt("library_address_id"));
	              System.out.println("dao"+rs.getString("library_name"));
	              libraryList.add( b );
	          }    
	    	  
	      }  catch(SQLException e) {
	          System.out.println("dao"+e);
	      }
	      return libraryList;
	   }

	 
		public Boolean approveLibrary(int id)  {
			// TODO Auto-generated method stub
			int n=0;
			try {
//				String query="insert into Item values( " +item.getitem_code()+",'"+item.getDescriptioin()+"',"+item.getQty()+","
//							+item.getMinQty()+","+item.getCost()+",'1');";
				String query="UPDATE  `library_address` SET  `library_status` =1 WHERE library_address_id="+id;
				Statement stmt = con.createStatement();
				n = stmt.executeUpdate( query );
				System.out.println("n: "+n);
			}
			 catch(SQLException e) {
		            System.out.println(e.getMessage());
		        }
			return n>0;
		}
		
		public Boolean disapproveLibrary(int id)  {
			// TODO Auto-generated method stub
			int n=0;
			try {
//				String query="insert into Item values( " +item.getitem_code()+",'"+item.getDescriptioin()+"',"+item.getQty()+","
//							+item.getMinQty()+","+item.getCost()+",'1');";
				String query="UPDATE  `library_address` SET  `library_status` =2 WHERE library_address_id="+id;
				Statement stmt = con.createStatement();
				n = stmt.executeUpdate( query );
				System.out.println("n: "+n);
			}
			 catch(SQLException e) {
		            System.out.println(e.getMessage());
		        }
			return n>0;
		}
		public Boolean deleteLibrary(int id)  {
			// TODO Auto-generated method stub
			int n=0;
			try {
//				String query="insert into Item values( " +item.getitem_code()+",'"+item.getDescriptioin()+"',"+item.getQty()+","
//							+item.getMinQty()+","+item.getCost()+",'1');";
				String query="UPDATE  `library_address` SET  `library_status` =3 WHERE library_address_id="+id;
				Statement stmt = con.createStatement();
				n = stmt.executeUpdate( query );
				System.out.println("n: "+n);
			}
			 catch(SQLException e) {
		            System.out.println(e.getMessage());
		        }
			return n>0;
		}


}
