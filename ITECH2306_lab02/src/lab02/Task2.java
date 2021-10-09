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
			System.out.println("请输入一个周数：");
			week = sc.nextInt();
			while (week < 1 || week > 4) {
				System.out.println("输入有误，请重新输入：");
				week = sc.nextInt();
			}
			
			//day
			System.out.println("请输入一个星期数：");
			day = sc.nextInt();
			while (day < 1 || day > 7) {
				System.out.println("输入有误，请重新输入：");
				day = sc.nextInt();
			}
			
			//month
			System.out.println("请输入一个月份：");
			month = sc.nextInt();
			while (month < 1 || month > 12) {
				System.out.println("输入有误，请重新输入：");
				month = sc.nextInt();
			}
			
			//输出结果
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
			
			//step 10: 判断是否继续输入日期
			System.out.println("Do you want to enter another date?  (1 = yes, 0 = no)");
			selection = sc.nextInt();
			while (selection < 0 || selection > 1) {
				System.out.println("输入有误，请重新输入：");
				selection = sc.nextInt();
			}
			if (selection == 0) {
				System.out.println("程序到此结束！");
			}
		} while (selection == 1);
	}
}
