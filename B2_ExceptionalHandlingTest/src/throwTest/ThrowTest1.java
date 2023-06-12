package throwTest;

public class ThrowTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age = 15;
		if (age < 18) {

			throw new Exception("---under age---");// this should be the last

		} else {
			System.out.println("eligible to vote");
		}
	}

}
