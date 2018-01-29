package Algorithmus_test;

import java.util.Random;

/*
	0~9까지의 세자리의 난수값을 얻은 뒤, 세개의 숫자를 입력합니다. 
	입력한 숫자가 난수값에 있으며 자리수가 일치하면 스트라이크 
	입력한 숫자가 난수값에 있으며 자리수가 일치하지 않으면 볼 
	입력한 숫자가 난수값에 없으면 아웃 을 결과로 출력하세요. 
	3스트라이크가 되면 게임이 종료하며, 아니면 반복 수행합니다

	첫 번째 자리수를 입력하세요:1
	두 번째 자리수를 입력하세요:9
	세 번째 자리수를 입력하세요:5
	0 스트라이트  : 2 볼 입니다. 계속합니다.
	첫 번째 자리수를 입력하세요:2
	두 번째 자리수를 입력하세요:3
	세 번째 자리수를 입력하세요:8
	아웃입니다. 계속합니다.
	첫 번째 자리수를 입력하세요:9
	두 번째 자리수를 입력하세요:1
	세 번째 자리수를 입력하세요:6
	2 스트라이트  : 0 볼 입니다. 계속합니다.
	첫 번째 자리수를 입력하세요:9
	두 번째 자리수를 입력하세요:1
	세 번째 자리수를 입력하세요:7
	3 스트라이트  입니다. 게임을 종료합니다.

 */
class Gamerule{
	private int data = 0;
	private int  c1, c2, c3;
	Random random = new Random();
	
	// 0부터 9까지의 세자리 난수값을 얻는다.
	
	
	private static String strike(){
		int data = 0;
		for (int i = 0; i <10; i ++) {
			//data = random.nextInt()
		}	
		return null;
	}
}

public class Q_9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//strike();
		// 3에서 12까지 범위의 정수를 랜덤하게 20개 출력
	    for (int i = 1; i <= 20; i++)
	      System.out.println(randomRange(3, 12));


	  }
	}

}
