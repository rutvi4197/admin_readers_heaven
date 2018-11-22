package bean;

public class rentBean {

	private int rent_id;
	private int library_book_mapping_id;
	private int user_id;
	private String issue_date;
	private String return_date;
	public int getRent_id() {
		return rent_id;
	}
	public void setRent_id(int rent_id) {
		this.rent_id = rent_id;
	}
	public int getLibrary_book_mapping_id() {
		return library_book_mapping_id;
	}
	public void setLibrary_book_mapping_id(int library_book_mapping_id) {
		this.library_book_mapping_id = library_book_mapping_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	
	
}
