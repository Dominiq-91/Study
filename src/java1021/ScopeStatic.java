package java1021;
/*
 	
 		* 변수의 Scope.
 		
 		프로그램상에서 변수가 적용될 수 있는 범위를 가지는데 이것을 변수의 Scope라고 한다.
 		변수가 선언된 블럭이 그 변수를 사용할수 있는 Scope이다.
 		
 		ex) public class ValableScopeExam{

        int globalScope = 10;   // 인스턴스 변수 

        public void scopeTest(int value){   
            int localScope = 10;
            System.out.println(globalScope);
            System.out.println(localScpe);
            System.out.println(value);
        }
    }
 		위의 경우에서 globalScope ValableScopeExam이라는 클래스 바로 하위에서 선언된 
 		전역변수 이다. (전역변수 : 클래스 전역에서 사용 가능한 변수)
 		
 		ValableScopeExam안에는 scopeTest라는 메소드가 선언되었고, 이 메소드 안에서
 		localScope가 선언되었다. 이 변수는 지역변수(지역변수 : 전역변수보다 하위의 범위에서 사용되는 변수)
 		
 		쉽게말하면 globalScope는 scopeTest메소드 안에서 사용 가능하지만,
 		localScope는 scopeTest 밖에서 사용할 수 없다. 이것이 변수의 Scope에 대한 개념이다.
 		
 		* Static
 		 
 		Static한 메소드는 Static한것만 받을 수 있다.
 		또한 Static하게 선언된 변수들은 고정된 값을 지닌다.
 	
 		ex)public class ScopeDemo2 {
    		static int i;
     
    		static void a() {
        	i = 0;
    		}
 
    		public static void main(String[] args) {
        		for (i = 0; i < 5; i++) {
            	a();
            	System.out.println(i);
        		}
    		}
 
		  }
 		
*/

public class ScopeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
