package throwTest;

public class ThrowTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int time = 0;
while(true) {
	if(time<4) {
		System.out.println("still in banking page");
		time++;
		Thread.sleep(1000);
	}else {
		throw new Exception("session expired");
	}
}
	}

}
