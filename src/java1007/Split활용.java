package java1007;

public class Split활용 {

	public static void main(String[] args) {
		

		String str = "010-7133-7844";
		String[] mobNum = str.split("-");
		
		System.out.println(mobNum[0]);
		System.out.println(mobNum[1]);
		System.out.println(mobNum[2]);
		
		
		
		String global = "서울,대전,대구,부산,포항,제주도";
		String[] local = global.split(",");
		
		
		System.out.println(local[0]);
		System.out.println(local[1]);
		System.out.println(local[2]);
		System.out.println(local[3]);
		System.out.println(local[4]);
		System.out.println(local[5]);
	}

}
