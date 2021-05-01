
public class UserManager{
	
	public void add(User user){
		System.out.println("User id : "+ user.getId()+" "+user.getFirstName()+" "+user.getLastName() + " added...");
	}
	
	public void delete(User user) {
		System.out.println("User id : "+ user.getId()+" "+user.getFirstName()+" "+user.getLastName() + " deleted...");
		
		}
	
	public void update(User user) {
		System.out.println("User id : "+ user.getId()+" "+user.getFirstName()+" "+user.getLastName() + " updated...");
		
		}
	
}
