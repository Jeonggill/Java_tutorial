
public class BinarySearch {

	public static int binarySearch (int data[], int key) {
		int low = 0, middle = 0, high = data.length -1;
		// high가 low보다 작아진다면 찾으려는 데이터가 데이터 집합에 없다.
		
		while (low <= high) {
			// 중앙값은 low와 high를 더한 값을 2로 나누면 된다.
			middle = (low + high) / 2; 
			
			// 중앙값과 찾으려는 값이 일치하면 middle를 리턴한다.
			if (key == data[middle]) return middle;
			
			// 만약 찾으려는 값이 중앙값보다 크다면 low를 middle + 1로 둔다.
			else if (key > middle + 1) low = middle + 1; //middle + 1은 짝수일 경우에
			
			// 만약 찾으려는 값이 중앙값보다 작다면 high를 middle - 1로 둔다.						
			else high = middle - 1; 
			}
		
		return -1; // 탐색이 실패하면 -1 반환 
	}
	public static void main(String[] args) {
		int searchKey = 3; 
		int intValue[] = { 4, 8, 3, 1, 6, 2 }; 
		System.out.println("이진 탐색"); 
		System.out.printf("찾은위치 = %d번째\n", binarySearch(intValue, searchKey)); 
	}
}
