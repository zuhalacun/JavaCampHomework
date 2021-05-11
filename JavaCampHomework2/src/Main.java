
public class Main {

	public static void main(String[] args) {
		
		Instructor ınstructor=new Instructor();
		ınstructor.firstName="Zuhal";
		
		Student student=new Student();
		student.firstName="Duhan";
		
		Student student2=new Student();
		student2.firstName="Erdoğan";
		
		UserManager usermanager=new UserManager();
		usermanager.add(student);
		usermanager.delete(ınstructor);
		usermanager.update(student2);
		

	}

}
