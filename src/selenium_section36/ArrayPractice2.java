package selenium_section36;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 5;
		int a[][] = {{2,4,7},{1,3,5},{9,8,7}};
		
		for(int i = 0; i<=2;i++) {
			for(int j = 0;j<=2;j++) {
				if(a[i][j]>max) {
					max = a[i][j];
				}
			}
			
		}
		System.out.println(max);
	}

}
