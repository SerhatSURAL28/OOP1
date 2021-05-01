
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		
		instructor.setAuthority("Sistemde herşeye yetkisi var...");
		System.out.println(instructor.FirstName+" "+instructor.LastName+"'un" +" "+instructor.getAuthority());
		
		System.out.println("********************");
		
		Student student=new Student();
		student.setId(2);
		student.setFirstName("Serhat");
		student.setLastName("sural");
		
		student.setCourseCompletionRate(5);
		System.out.println(student.getCourseCompletionRate());
		
		System.out.println("*******************");
		
		
		User user= new User();
		user.setId(3);
		user.setFirstName("Ahmet");
		user.setLastName("yılmaz");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.add(student);
		userManager.add(instructor);
		System.out.println("*****************");
		userManager.delete(user);
		userManager.delete(student);
		userManager.delete(instructor);
		System.out.println("*****************");
		userManager.update(user);
		userManager.update(student);
		userManager.update(instructor);
		System.out.println("*****************");
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student);
		System.out.println("*****************");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.createCourse(instructor);

	}

}
