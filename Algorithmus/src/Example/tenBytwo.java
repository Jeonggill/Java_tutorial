package Example;

import java.util.Scanner;

public class tenBytwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2������ ��ȯ�� ������ �Է��ϼ���. :"); 		// ���� �ޱ�
		int i = scanner.nextInt();								// ���� ������ ������ ����
		Stack stack = new Stack(20);
		while(i > 0) {
			stack.push(i % 2);		//2�� ������ �������� ����
			i /= 2;	
		}
		while(!stack.empty()) {
		System.out.print(stack.pop());		// ���� ����ٸ� ���
		}
	}
}