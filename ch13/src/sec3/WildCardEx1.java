package sec3;

public class WildCardEx1 {

	public static void main(String[] args) {
		Course.regCourse1(new Applicant<Person>(new Person()));
		Course.regCourse1(new Applicant<Worker>(new Worker()));
		Course.regCourse1(new Applicant<Student>(new Student()));
		Course.regCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.regCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.regCourse2(new Applicant<Student>(new Student()));
		Course.regCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.regCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.regCourse3(new Applicant<Person>(new Person()));
		Course.regCourse3(new Applicant<Worker>(new Worker()));
		

	}

}
