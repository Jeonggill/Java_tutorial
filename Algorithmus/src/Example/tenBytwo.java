package Example;

import java.util.Scanner;

public class tenBytwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2진수로 변환할 정수를 입력하세요. :"); 		// 정수 받기
		int i = scanner.nextInt();								// 받은 정수를 변수로 지정
		Stack stack = new Stack(20);
		while(i > 0) {
			stack.push(i % 2);		//2로 나누고 나머지만 저장
			i /= 2;	
		}
		while(!stack.empty()) {
		System.out.print(stack.pop());		// 값이 비었다면 출력
		}
	}
}