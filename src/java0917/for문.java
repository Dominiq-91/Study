package java0917;

public class for문 {

	// for반복문 자체에 변수 초기화, 조건식, 증감식이 한줄로 표현된다. 
	
	public static void main(String[] args) {
		
		int total = 0;
		for(int i = 1; i <= 100; i++) {// 1부터; 100보다 작거나 같을때까지, 1씩 증식/ 왼쪽부터 오른쪽으로 true로 return.
			if(i == 50){
				break; // If문에 조건이 합당하면 continue를 만나 아래식으로 내려가지않고 for구문의 루트를 반복한다.
			}
			total = total + i;
		}
		System.out.println(total);
	}	
}



// break와 continue의 차이점은
// break는 반복문을 중지하지만, continue는 조건식을 만나면 continue이전까지의 반복문만 수행한다.
