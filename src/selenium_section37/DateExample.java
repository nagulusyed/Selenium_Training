package selenium_section37;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		Scanner s = new Scanner();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
	}

}
