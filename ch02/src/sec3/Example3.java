package sec3;

public class Example3 {

	public static void main(String[] args) {
		int kor1, eng1, mat1;
		int kor2, eng2, mat2;
		int kor3, eng3, mat3;
		int tot1, tot2, tot3;
		float avg1, avg2, avg3;
		
		kor1 = 90; eng1 = 80; mat1 = 100;
		kor2 = 80; eng2 = 75; mat2 = 90;
		kor3 = 100; eng3 = 95; mat3 = 60;
		
		tot1 = kor1 + eng1 + mat1;
		tot2 = kor2 + eng2 + mat2;
		tot3 = kor3 + eng3 + mat3;
		
		avg1 = tot1 / 3.0f;
		avg2 = tot2 / 3.0f;
		avg3 = tot3 / 3.0f;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n","번호", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.2f\n", 1, kor1, eng1, mat1, tot1, avg1);
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.2f\n", 2, kor2, eng2, mat2, tot2, avg2);
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.2f\n", 3, kor3, eng3, mat3, tot3, avg3);
	}

}
