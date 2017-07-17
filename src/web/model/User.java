package web.model;

public class User {
	
	public static final String TABLE = "users";
	public static final String COL_FNAME = "first_name";
	public static final String COL_LNAME = "last_name";
	public static final String COL_USERNAME = "username";
	public static final String COL_PASSWORD = "password";
	public static final String COL_DES = "description";
	public static final String COL_ID = "userid";
	
	private int userid;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String description;
    
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
    public String toString() {
        return "User [userid=" + userid + ", firstName=" + first_name
                + ", lastName=" + last_name + ", password=" + password + ", username="
                + username + ", desc=" + description + "]";
    } 
	
}
