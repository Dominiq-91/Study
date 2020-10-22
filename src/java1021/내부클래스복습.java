package java1021;

//public class 내부클래스복습 {
/*
  		1. 내부클래스
  		
  	public class InnerExam{
  		class Cal{
  			int value = 0;
  			
  			public void plus(){
  			value++;
  			}
  		}
  		
  	}
  	
 
	public static void main(String[] args) {
		
		InnerExam t = new InnerExam();
		innerExam.Cal cal = t.new Cal();
		(바깥클래스타입.내부타입) = (Cal 생성)
		
		 cal.plus();
		 System.out.println(cal.value);
		
	}

}


	2. Static 내부 클래스 - 정적중첩클래
	
	
	  	public class InnerExam{
  			static class Cal{
  			int value = 0;
  			
  			public void plus(){
  			value++;
  			}
  		}
  		
  	}
  	
  		public static void main(String[] args) {
		
		InnerExam.Cal. cal = new InnerExam.Cal();  바깥쪽걸 먼저 생성안하고 바로 생성가능함.
				
		 cal.plus();
		 System.out.println(cal.value);
		
	}

}

	3. 지역 클래스 (지역중첩클래스)
	
	public void exec(){
	
	  		class Cal{
  			int value = 0;
  			
  			public void plus(){
  			value++;
  			}
  		}
  		Cal cal = new Cal();       -> 메서드 안에서 클래스가 선언됬기때문에, 객체생성은 메서드 안에서밖에 못한다.
  		cal.plus();
  		System.out.println(cal.value);
  		  		
	}

	public static void main(String[] args) {
		
		InnerExam t = new InnerExam();
		t.exec();
		
	}

}
*/
