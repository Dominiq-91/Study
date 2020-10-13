package java1013;

public class EnumExam {
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		 
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";  // gender1 타입자체가 string 타입이기때문에 string아무거나 들어가도 컴파일 시점에서는 문제가 발생하지 않는다.
						  // 그러나 gender1에 MALE이나 FEMALE 만 들어오게하고, 다른값이 들어오면 문제가 발생할수도 있는데 이럴때 열거형을 사용한다.
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy";   // 열거형으로 젠터타입에 2개의 선택지만 넣었기때문에 다른것은 올수 없다.
	}

}
enum Gender{
	MALE,FEMALE;
}
