package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
			
		//step 3
		Scanner scan = new Scanner(System.in);
		
		//step4
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("���������֣� ");
			int n1 = scan.nextInt();
			numbers[i] = n1;
		}
		System.out.println("numbers����Ϊ��" + Arrays.toString(numbers));
		System.out.println();
		
		//step 5
		System.out.print("You entered the following numbers: ");
		int k = 0; 
		while (k < numbers.length) {
			System.out.print(numbers[k] + " ");
			k++;
		}
		System.out.println();
		
		//step 7
		System.out.print("������һ������ֵ�� ");
		int n2 = scan.nextInt();
		System.out.print("�����б�" + n2 + "С�����ǣ� ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < n2) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
		//step 8 & 9
		int largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println("The maximum value is " + largest);
		
		//step 10
		int[] reverse = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			reverse[9-i] = numbers[i];
		}
		
		System.out.print("numbers����Ϊ��");
		int x = 0; 
		while (x < numbers.length) {
			System.out.print(numbers[x] + " ");
			x++;
		}
		System.out.println();
		
		System.out.print("reverse����Ϊ��");
		int y = 0; 
		while (y < reverse.length) {
			System.out.print(reverse[y] + " ");
			y++;
		}
		System.out.println();
	}

}
