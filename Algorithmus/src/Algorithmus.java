// import java.util.Arrays;

public class Algorithmus {
	//4,8,3,1,6,2, ����
	
	public static void main(String[] args) { 
		int[] data = {4, 8, 3, 1, 6, 2};
		int numUnsorted = data.length;
		for(int x=0; x<numUnsorted; x++){
			for(int y=x+1; y<numUnsorted; y++){		//y=x+1; �ϳ��� �� �ض�
				if(data[x] > data[y]){
					int temp = data[y];
					data[y] = data[x];
					data[x] = temp;
				}
			}
				System.out.println("\n" + (x+1) + "�� ����  ���");
			for(int index=0; index<data.length; index++) System.out.print(data[index] + " ");
		}
			System.out.println("\n\n*** ��� ***");
		for(int index=0; index<data.length; index++) System.out.print(data[index] + " ");
	}
}	
	/*public static void main(String[] args) {

		int[] s = {4,8,3,1,6,2};
		
		Arrays.sort(s);	//�迭

		System.out.println(Arrays.toString(s));
		//for(int i)
		}*/