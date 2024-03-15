package selenium_section38;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,3,3,2,4,4,5,2};
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for(int i = 0; i<a.length;i++) {
			
			int k = 0;
			
			 if(!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				
				for(int j = i+1; j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				if(k==1) {
				System.out.println(a[i] +" is unique number" );
				}
			}
		}

	}

}
