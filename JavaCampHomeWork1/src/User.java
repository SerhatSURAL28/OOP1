
public class User {
	
	int id;
    String FirstName;
    String LastName;
    String  birthDate;
    private String mail;
	private String address;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String birthDate, String mail, String address) {
		this.id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.birthDate = birthDate;
		this.mail = mail;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
