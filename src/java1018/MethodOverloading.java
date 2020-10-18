package java1018;

public class MethodOverloading {
/*

		# 메소드 오버로딩
	
	메소드 오버로딩은 같은 이름을 가진 여러개의 메소드를 일컫는다.
	같은 이름을 가진 여러개의 메소드를 만드는것이 가능한 이유는, 메소드의 매개변수들의 갯수나 타입이 다르기 떄문이다.	

	[예제 1]
	
	public class overloadingDemo{
	
		int left, right;
		int middle;
		
		public void setOperands (left, right){
		
			this.left = left;
			this.right = right;
			
		}
		
		public void setOperands (left, middle, right){
		
			this.left = left;
			this.middle = middle;
			this.right = right;
		
		}
	}

 */
	public static void main(String[] args) {
/*

		Calculator c1 = new Calculator(); 
		
        c1.setOprands(10, 20);   
        c1.sum();       
        c1.avg();
        
        c1.setOprands(10, 20, 30);  -> 같은 이름의메소드 호출을 위에서도 해주었으나, 둘다 가능한 이유는 바로 매개변수의 갯수가 다르기 떄문이다.
        c1.sum();       
        c1.avg();
		
		* 매개변수의 갯수가 같아도 타입이 다르면 다른걸로 인식한다. 
		
		public void setOperands(String left, int right)와,
		public void setOperands(int left, String right)는 다른 메소드이다. 매개변수의 갯수가 같아도 매개변수의 타입이 틀리다면 다른 메소드로 인식한다.
		
		그러나.
		public int setOperands(int left, int right)와,
		public void setOperands(int left, int right)는 컴파일 오류가 일어난다. 그 이유는
		
		.setOprands(10,20)으로 호출 했을때, 서로 다른 타입을 가지는 두 메소드의 매개변수가 완벽히 일치하기떄문에 컴퓨터에서 어떤 메소드를 불러올지 인식할 수 없기 떄문이다.
		
		
		
 */

	}

}
