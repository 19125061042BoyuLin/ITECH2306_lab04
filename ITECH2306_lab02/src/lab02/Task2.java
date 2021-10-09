package lab02;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		String[] monthNames = {"invalid", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int selection = 1;
		int week;
		int month;
		int day;
		Scanner sc = new Scanner(System.in);
		
		//step 5
		do {
			//week
			System.out.println("������һ��������");
			week = sc.nextInt();
			while (week < 1 || week > 4) {
				System.out.println("�����������������룺");
				week = sc.nextInt();
			}
			
			//day
			System.out.println("������һ����������");
			day = sc.nextInt();
			while (day < 1 || day > 7) {
				System.out.println("�����������������룺");
				day = sc.nextInt();
			}
			
			//month
			System.out.println("������һ���·ݣ�");
			month = sc.nextInt();
			while (month < 1 || month > 12) {
				System.out.println("�����������������룺");
				month = sc.nextInt();
			}
			
			//������
			if (week == 1) {
				System.out.print("1st ");
			}else if (week == 2) {
				System.out.print("2nd ");
			}else if (week == 3) {
				System.out.print("3rd ");
			}else {
				System.out.print("4th ");
			}
			System.out.print(dayNames[day-1] + " " + "of ");
			System.out.println(monthNames[month]);
			
			//step 10: �ж��Ƿ������������
			System.out.println("Do you want to enter another date?  (1 = yes, 0 = no)");
			selection = sc.nextInt();
			while (selection < 0 || selection > 1) {
				System.out.println("�����������������룺");
				selection = sc.nextInt();
			}
			if (selection == 0) {
				System.out.println("���򵽴˽�����");
			}
		} while (selection == 1);
	}
}
