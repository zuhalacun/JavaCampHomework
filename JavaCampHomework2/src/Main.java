
public class Main {

	public static void main(String[] args) {
		
		Instructor �nstructor=new Instructor();
		�nstructor.firstName="Zuhal";
		
		Student student=new Student();
		student.firstName="Duhan";
		
		Student student2=new Student();
		student2.firstName="Erdo�an";
		
		UserManager usermanager=new UserManager();
		usermanager.add(student);
		usermanager.delete(�nstructor);
		usermanager.update(student2);
		

	}

}
