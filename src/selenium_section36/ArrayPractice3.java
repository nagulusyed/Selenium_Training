package selenium_section36;



public class ArrayPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 5;
		
		
		int a[][] = {{2,4,7},{1,3,5},{9,8,7}};
		
		int mincoloumn = 0;
		
		for(int i = 0; i<=2;i++) {
			for(int j = 0;j<=2;j++) {
				if(a[i][j]<min) {
					min = a[i][j];
					mincoloumn=j;
				}
			}
			
		}
		int max = a[0][mincoloumn];
		int k = 0;
		while(k<3) {
			if(a[k][mincoloumn]>max) {
				max=a[k][mincoloumn];
			}
			k++;
		}
		System.out.println("max number "+max);
		System.out.println("min number "+min);

	}

}
