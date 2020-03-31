package Game;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] mList = {1,2,3,4,5,6,7,8,9};
		if(mList > 5) {
			
		}
		int i = 1;
		while(i <= 20) { //i 20보다 크거나 같을때까지
			int a = (int) (Math.random() * 10) + 1;
			i++;
			System.out.println(a);
			
		}
	}

}
