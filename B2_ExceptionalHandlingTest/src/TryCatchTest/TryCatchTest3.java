package TryCatchTest;

public class TryCatchTest3 {
	public static void main(String[] args) {
		System.out.println("start");
		
try {
	// Arithmetic Exception
		int i = 1 / 0;
		System.out.println(i);
		// ArrayIndexOutofBoundException
		int[] a = new int[3];// 0,1,2
		a[4] = 100;
		System.out.println(a[4]);

	}catch(Exception e){//can use instead of multiple catch
		System.out.println("sorry something went wrong: " + e.getMessage());
	}//only one message can be given and cannot find the specific error
System.out.println("stop");
}
}
