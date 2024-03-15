package selenium_section3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]+" is divisible by 2");
			}
			else {
				System.out.println(arr[i]+" is not divisible by 2"); 
			}
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("syed");
		a.add("nagulu");
		a.add("selenium");
		a.add("framework");
		System.out.println(a.get(3));
		
		for(int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("**************");
		
		for(String val :a) {
			System.out.println(val);
		}
		System.out.println(a.contains("selenium"));
		
		String[] name = {"syed1","syed2","selenium","framework"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("framework");
	}

}
