package selenium_section3;

public class JavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello syed";
		String s2 = "hello world";
		
		String s3 = new String("hello selenium");
		String s4 = new String("hello framework");
		
		String s = "hello nagulu syed";
		String[] splittedString = s.split("nagulu");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
