package TryCatchTest;

public class TryCatchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Start");
try {
int i=1/1;
System.out.println(i);
int []a=new int[3];//0,1,2
a[4]=100;
System.out.println(a[4]);
System.out.println("Stop");
	}catch(ArithmeticException e){//only for ArithmeticException
		System.out.println("alert: you have entered invalid number: "+ e.getMessage());
		//only one exception can be handled at a time
	}catch(ArrayIndexOutOfBoundsException e){//can give mutiple catch for multiple exception
		System.out.println("you have entered invalid index: "+e.getMessage());
	}
System.out.println("stop");
}
}
