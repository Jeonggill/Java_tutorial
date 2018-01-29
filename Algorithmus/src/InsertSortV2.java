
public class InsertSortV2 {

	public static void main(String[] args) {
		int[] data = {4, 8, 3, 1, 6, 2};
		int numSorted = 1;
		int index;
		while (numSorted < data.length) {
			int temp = data[numSorted];
			for (index = numSorted; index > 0; index--) {
				if (temp < data[index -1]) {
					data [index] = data[index - 1];
				} else {
					break;
				}	
			}
			data[index] = temp;
			numSorted++;
			
			System.out.println("\n" + (numSorted - 1) + "번 수행 결과");
			for(int i=0; i<data.length; i++) System.out.println(data[i] + " ");
		}

		System.out.println("\n\n*** 결과 ***");
		for(index=0; index<data.length; index++) System.out.print(data[index] + " ");
	}

}
