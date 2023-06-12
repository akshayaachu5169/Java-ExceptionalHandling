package TryCatchTest;

public class TryCatchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		try {
			
			
		int i=1/0;
		System.out.println(i);
		
		
	}catch (ArithmeticException e){
		System.out.println("alert:you have entered invalid number" + e.getMessage());
	}
		System.out.println("stop");
	}

}//try to handle or give an alert
