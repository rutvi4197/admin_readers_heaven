package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.dashboard_adminBean;
import util.DBConnection;
import java.util.Calendar;

public class dashboardDAO {

	 private final Connection con;
	 public dashboardDAO()  throws ClassNotFoundException, SQLException {
	        con = DBConnection.getInstance().getConnection();   
	    }
		
		  public List<dashboard_adminBean> getDashboardDetails(){
			  Calendar now = Calendar.getInstance();
		      List<dashboard_adminBean> libraryList =new ArrayList<dashboard_adminBean>();
		      Statement stmt;
		      Statement stmt1;
		      Statement stmt2;
		      Statement stmt3;
		      dashboard_adminBean b;
		      try {
		        int ysale=0;
		        int msale=0;
		        int dsale=0;
		        int lib=0;
		        int dislib=0;
		        int applib=0;
		        b = new dashboard_adminBean();
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("SELECT * FROM `rent` as ra,`library_book_mapping` as b,`book` as ba where ba.book_id=b.book_id and ra.library_book_mapping_id=b.library_book_mapping_id");
		         
		          
		          int y=now.get(Calendar.YEAR);
		         int m=now.get(Calendar.MONTH)+1;
		         int d=now.get(Calendar.DATE);
		         int cnt=0;
		         int new_arrival=0;
		         stmt1 = con.createStatement();        
		          ResultSet rs1 = stmt1.executeQuery("SELECT * FROM library_address where library_status=1");
		         while(rs1.next())
		         {
		        	 lib=lib+1;
		         }
		         stmt2 = con.createStatement();        
		          ResultSet rs2 = stmt2.executeQuery("SELECT * FROM library_address where library_status=2");
		         while(rs2.next())
		         {
		        	 dislib=dislib+1;
		         }
		         stmt3 = con.createStatement();        
		          ResultSet rs3 = stmt3.executeQuery("SELECT * FROM library_address where library_status=0");
		         while(rs3.next())
		         {
		        	 applib=applib+1;
		         }
		          while ( rs.next() ) 
		          {
		              
		              String s1=rs.getString("issue_date");
		              String s2=rs.getString("add_on");
		              int rent=rs.getInt("mrp");
		              cnt+=rs.getInt("count");
		              System.out.println("Hii"+y+" "+m+" "+s1.substring(6,10)+" "+s1.substring(3,5));
		              if(Integer.parseInt(s1.substring(6,10))==y) {
		            	  ysale+=rent;
		            	  System.out.println("Hii 1"+ysale);
		              }
		              if(Integer.parseInt(s1.substring(3,5))==m && Integer.parseInt(s1.substring(6,10))==y) {
		            	  msale+=rent;
		            	  System.out.println("Hii 2");
		              }
		              if(Integer.parseInt(s2.substring(3,5))==m) {
		            	  new_arrival++;
		            	  
		              }
		              if(Integer.parseInt(s1.substring(0,2))==d && Integer.parseInt(s1.substring(3,5))==m && Integer.parseInt(s1.substring(6,10))==y) {
		            	  
		            	  dsale+=rent;
		            	  System.out.println("Hii 3"+dsale);
		              }
		          
		              libraryList.add( b );
		          }   
		          b.setYearly_sale(ysale);
		          b.setMonthly_sale(msale);
		          b.setTotal_book(cnt);
		          b.setNew_arrival(new_arrival);
		          b.setWeekly_sale(dsale);
		    	  b.setTotal_lib(lib);
		    	  b.setApproved_lib(applib);
		    	  b.setDisapproved_lib(dislib);
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
		      return libraryList;
	   }


}
