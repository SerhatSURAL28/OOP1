
public class StudentManager extends UserManager{
	
	public void joinCourse(User user) {
		System.out.println("User id : "+user.getId()+" "+user.getFirstName()+" "+user.getLastName() +" joined course...");
	}

}
