package TryCatchTest;

public class TryCatchTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		// Arithmetic Exception
		try {
			int i = 1 / 1;
			System.out.println(i);
			// ArrayIndexOutofBoundException
			int[] a = new int[3];// 0,1,2
			a[1] = 100;
			System.out.println(a[1]);
			// NullPointerException
			String x = null;
			x.concat("aaa");
		} catch (ArithmeticException e) {//ArithmeticException e = new ArithmeticException();			
			System.out.println("alert: you have entered invalid number: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you have entered invalid index: " + e.getMessage());
		}

		catch (Exception e) {// everything checked ,incase unexpected error occurs eg: money transfer
			System.out.println("sorry something went wrong, our team will contact soon: " + e.getMessage());
		}//Exception always should be at last
		System.out.println("stop");
	}
}
