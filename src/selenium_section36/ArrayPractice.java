package selenium_section36;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 5;
		int a[][] = {{2,4,7},{1,3,5},{9,8,7}};
		
		for(int i = 0; i<=2;i++) {
			for(int j = 0;j<=2;j++) {
				if(a[i][j]<min) {
					min = a[i][j];
				}
			}
			
		}
		System.out.println(min);

	}

}
