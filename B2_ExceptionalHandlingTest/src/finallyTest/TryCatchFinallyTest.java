package finallyTest;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Login DB");
		System.out.println("Start");
try {
		int i = 1 / 0;
		System.out.println(i);
		

	}catch(ArithmeticException e){
		System.out.println("alert:You have entered an invalid number- "+ e.getMessage());
	}
finally {
		System.out.println("Logout DB");
		System.out.println("Stop");
	}

	}
	}


