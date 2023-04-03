package sec3;

public class Course {
	public static void regCourse1(Applicant<?> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course1을 등록함");
	}
	public static void regCourse2(Applicant<? extends Student> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course2을 등록함");
	}
	public static void regCourse3(Applicant<? super Worker> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course3을 등록함");
	}
}
