
public class Student extends User{
      String grade;
      public Student() {
    	  
      }
      
      public Student(String grade) {
  		super();
  		this.grade = grade;
  	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
}
