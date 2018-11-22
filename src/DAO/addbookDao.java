package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.addbookBean;
import util.DBConnection;


public class addbookDao {
	 private final Connection con;	
		public addbookDao()  throws ClassNotFoundException, SQLException {
			//System.out.println("hii shilpi in database");
	        con = DBConnection.getInstance().getConnection();   
	    }
		
		public List<addbookBean> getAllcategory(){
		      List<addbookBean> category =new ArrayList<addbookBean>();
		      Statement stmt;
		      addbookBean b;
		      try {
		        System.out.println("llllll");
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("select * from category");
		         
		          while ( rs.next() ) 
		          {
		              b = new addbookBean();
		              b.setCategory_id(rs.getInt("category_id"));
		              b.setCategory_name(rs.getString("category_name"));
		              System.out.println("dao"+rs.getString("category_name"));
		              category.add( b );
		          }    
		    	  
		      }  catch(SQLException e) {
		          System.out.println("dao"+e);
		      }
		      System.out.println("ccccc");
		      return category;
		}
		

		public int addbook(String book_title,String author,int edition,String publisher,String isbn,int pages,int mrp,int categorys,String description,int publish_year,String book_language,String strDate,String modified_on,int status) {
			int n=0;
			//int id=0;
			try {
				String query="insert into book values(null,'"+book_title+"','"+author+"',"+edition+",'"+publisher+"','"+isbn+"',"+pages+","+mrp+",'aayushi',"+categorys+",'"+description+"',"+publish_year+",'"+book_language+"',0,'"+strDate+"','"+
						modified_on+"');";
			
				Statement stmt = con.createStatement();
				n = stmt.executeUpdate( query );
				if(n>0)
				{
					System.out.println("Inserted");
				}
				else
				{
					System.out.println("not");
				}
				
				
				
				
			}
			 catch(SQLException e) {
		            System.out.println(e.getMessage());
		        }
			
			return n;
			
		}
		
		
		public List<addbookBean>getallbook()
		
		{
			List<addbookBean> bookList =new ArrayList<addbookBean>();
		      Statement stmt;
		      addbookBean b;
		      try {
		        
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("select book.book_id,book.book_title,book.author,book.edition,book.publisher,book.isbn,book.pages,book.mrp,book.photo,book.description,book.publish_year,book.book_language,category.category_id,category.category_name from book,category Where book.category_id=category.category_id and book.status=0");
		          
		          while(rs.next())
		          {
		        	  b= new addbookBean();
		        	  b.setBook_id(rs.getInt("book_id"));
		        	  b.setBook_title(rs.getString("book_title"));
		        	  b.setAuthor(rs.getString("author"));
		        	  b.setEdition(rs.getInt("edition"));
		        	  b.setPublisher(rs.getString("publisher"));
		        	  b.setIsbn(rs.getString("isbn"));
		        	  b.setPages(rs.getInt("pages"));
		        	  b.setMrp(rs.getInt("mrp"));
		        	  b.setPhoto(rs.getString("photo"));
		        	  b.setCategory_name(rs.getString("category_name"));
		              b.setDescription(rs.getString("description"));
		              b.setPublish_year(rs.getInt("publish_year"));
		              b.setBook_language(rs.getString("book_language"));
		              bookList.add(b);
		          }
		          }
		      catch(Exception e) {
		    	  System.out.println("dao"+e);
		      		}
		      return bookList;
		         
		          
		      	}
		
		
public List<addbookBean>getBookById(int id)
		
		{
			List<addbookBean> bookList =new ArrayList<addbookBean>();
		      Statement stmt;
		      addbookBean b;
		      try {
		        
		    	  stmt = con.createStatement();        
		          ResultSet rs = stmt.executeQuery("select book.book_id, book.book_title,book.author,book.edition,book.publisher,book.isbn,book.pages,book.mrp,book.photo,book.description,book.publish_year,book.book_language,category.category_id,category.category_name from book,category Where book.category_id=category.category_id and book.book_id=" + id + " ");
		          
		          while(rs.next())
		          {
		        	  b= new addbookBean();
		        	  b.setBook_id(rs.getInt("book_id"));
		        	  b.setBook_title(rs.getString("book_title"));
		        	  b.setAuthor(rs.getString("author"));
		        	  b.setEdition(rs.getInt("edition"));
		        	  b.setPublisher(rs.getString("publisher"));
		        	  b.setIsbn(rs.getString("isbn"));
		        	  b.setPages(rs.getInt("pages"));
		        	  b.setMrp(rs.getInt("mrp"));
		        	  b.setPhoto(rs.getString("photo"));
		        	  b.setCategory_name(rs.getString("category_name"));
		              b.setDescription(rs.getString("description"));
		              b.setPublish_year(rs.getInt("publish_year"));
		              b.setBook_language(rs.getString("book_language"));
		              bookList.add(b);
		          }
		          }
		      catch(Exception e) {
		    	  System.out.println("dao"+e);
		      		}
		      return bookList;
		         
		          
		      	}
		int i=1;
public Boolean deleteBook(int id) {
	
	String sql = "UPDATE book SET status=" + i + " WHERE book_id = " + id + "; ";
    int n=0;
    try {
    	System.out.println("In try2");
        Statement stmt = con.createStatement();
        n = stmt.executeUpdate( sql );
    }
    catch(SQLException e) {
        System.out.println(e.getMessage());
    }
    return n>0;
}

public int updatebook(String book_title,String author,int edition,String publisher,String isbn,int pages,int mrp,int categorys,String description,int publish_year,String book_language,String modified_on,int id) {
	int n=0;
	System.out.println("in update"+categorys+id);
	//int id=0;
	try {
		String query="Update book set book_title='" + book_title + "' , author='" + author+"', edition="+edition+", publisher='"+publisher+"', isbn='"+isbn+"',pages="+pages+",mrp= "+mrp+", category_id= "+categorys+",description= '"+description+"',publish_year="+publish_year+",book_language='"+book_language+"',modified_on='"+modified_on+"' where book_id= " + id + "";
		//String query="update admin set email= '" + email + "' , password='" + password + "' where admin_id = " + id + " ; "; 
	System.out.println(query);
		Statement stmt = con.createStatement();
		n = stmt.executeUpdate( query );
		
		
		
		
	}
	 catch(SQLException e) {
            System.out.println(e.getMessage());
        }
	return n;
	
	
}
		      

			
	
}


