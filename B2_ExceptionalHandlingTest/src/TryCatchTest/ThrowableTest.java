package TryCatchTest;

public class ThrowableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");

		try {
			// Arithmetic Exception
			int i = 1 / 1;
			System.out.println(i);
			// ArrayIndexOutofBoundException
			int[] a = new int[3];// 0,1,2
			a[1] = 100;
			System.out.println(a[1]);
			// NullPointerException
			String x = null;
			x.concat("aaa");
		} catch (ArithmeticException e) {
			System.out.println("alert: you have entered invalid number: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you have entered invalid index: " + e.getMessage());
		}

		catch (Exception e) {
			System.out.println("sorry something went wrong, our team will contact soon: " + e.getMessage());
		}
		// it should be given atlast
		catch (Throwable t) {// incase of MemoryOutageError, Linkage Error
			System.out.println("alert: There is an error: " + t.getMessage());
		}
		System.out.println("stop");
	}
}
