package change;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		int[] nominal = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int change, coins_number;
		
		System.out.println("Podaj resztê do wydania: ");
		Scanner read = new Scanner(System.in);
		float temp = read.nextFloat(); //Change in "z³"
		temp *= 100;
		change = (int) temp; //Change in "gr."
		
		while(change > 0){
			for(int i=0; i < nominal.length; i++){
				if(change >= nominal[i]){
					coins_number = change/nominal[i];
					
					System.out.print(coins_number + " x ");
					if(nominal[i] >= 100) System.out.println(nominal[i]/100 + "z³.");
					else System.out.println(nominal[i] + "gr.");
					
					change -= coins_number * nominal[i];
				}
			}
		}
	}
}
