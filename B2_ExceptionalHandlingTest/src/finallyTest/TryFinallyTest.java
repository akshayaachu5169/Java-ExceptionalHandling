package finallyTest;

public class TryFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Login DB");
		System.out.println("Start");
try {
		int i = 1 / 0;
		System.out.println(i);
		

	}finally {
		System.out.println("Logout DB");
		System.out.println("Stop");
	}

	}
}
