package selenium_section3;


public class Arrayexample {

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

	}

}
