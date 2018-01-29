package Algorithmus_test;

import java.util.Scanner;

public class Q_8 {
	public static void main(String[] args) {
		
		
		int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요:"); 
		int intMonth = scanner.nextInt();
		System.out.print("월을 입력하세요:"); 
		int intDate = scanner.nextInt();
		
		
		
		int sum = 0;
		for(int index = 1; index < intMonth; index++) {
			sum += month[index -1];
		}
		System.out.println(day[(sum+(intDate-1) % 7)]);
	}	
}

