package java1020;

public class BizExam {

	public static void main(String[] args) {
		
		BizService biz = new BizService();
		biz.BizMethod(5);
		try {
			biz.BizMethod(-3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
