package java1014;

class Calculator {  // 지금부터 calculator라는 객체의 설계도를 컴퓨터에게 알려주겠다
	
	int left, right;
	
	public void setOprands(int left,int right) {
		
		this.left = left;     // this. 은 우리가 생성한 인스턴스를 가리키는 것이다. 해당 class 안의 int left를 말하는 것이다.
		this.right = right;   // 우항의 left는 매개변수 left가 들어온다.
				
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

public class ClassInstanceObject3 {

	
	public static void main(String[] args) {
							 
		Calculator c1 = new Calculator();  //claculator라는 객체를 새로 만들고 그걸 c1이라는 변수에 담으면서, 타입을 객체 본인으로 지정한다.  	
		c1.setOprands(10, 20); // .setOprands 라는 메소드는 연산의 대상이 될 값을 의미한다. 여기에서는 10과 20이 setOprands의 인자값이 된다.
		c1.sum(); // -> 30이 됨.
		c1.avg(); // -> 15가 됨.
		
		Calculator c2 = new Calculator(); // 변수에 담겨있는 실제 내용을 인스턴스(구체적인 객체)라고 한다.
		c2.setOprands(20,40); // left = 20, right = 40 이 된다는 뜻.
		c2.sum(); 
		c2.avg();
	}

}
