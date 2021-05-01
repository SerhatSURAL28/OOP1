
public class Instructor extends User {

	private String authority;

	public Instructor() {
		
	}

	public Instructor(String authority) {
		this.authority = authority;
		
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
