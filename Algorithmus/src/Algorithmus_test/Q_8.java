package Algorithmus_test;

import java.util.Scanner;

public class Q_8 {
	public static void main(String[] args) {
		
		
		int [] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] day = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:"); 
		int intMonth = scanner.nextInt();
		System.out.print("���� �Է��ϼ���:"); 
		int intDate = scanner.nextInt();
		
		
		
		int sum = 0;
		for(int index = 1; index < intMonth; index++) {
			sum += month[index -1];
		}
		System.out.println(day[(sum+(intDate-1) % 7)]);
	}	
}

