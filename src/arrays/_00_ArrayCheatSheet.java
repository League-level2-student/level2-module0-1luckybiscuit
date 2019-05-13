package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"epic", "gamer", "time", "for", "Johnny"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "moment";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int[] list = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<list.length;i++) {
			Random num = new Random();
			int count = num.nextInt(50);
			//System.out.println(count);
			list[i] = count;
		}
		//8. without printing the entire array, print only the smallest number in the array
		boolean broker = true;
		for(int compare = 0; compare < 50; compare++) {
			for(int i:list) {
				if(list[i] == compare && broker) {
					System.out.println(list[i]);
					broker = false;
				}
			}
			
		}
		//9 print the entire array to see if step 8 was correct
		//slashed code in for loop above
		//10. print the largest number in the array.
		boolean breaker = true;
		for(int compare = 50; compare > 0; compare--) {
			for(int i:list) {
				if(list[i] == compare && breaker) {
					System.out.println(list[i]);
					breaker = false;
				}
			}	
		}
	}
}
