package selenium_section36;

public class ChildClassDemo extends ParentClassDemo {
	public void engine() {
		System.out.println("new engine");
	}
	public void colour() {
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo cd = new ChildClassDemo();
		cd.colour();
		cd.breaks();
		cd.audiosystem();
		cd.gear();
		

	}

}
