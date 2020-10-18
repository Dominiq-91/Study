package Java1017;

public class factorial {

	
	
	public int fact(int x) {
		if(x == 1) {
			return 1;
		}else {
			return x * fact(x-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		 factorial ft = new factorial();
		 
		 int value = ft.fact(5);
		 
		 System.out.println(value);
	}

}
