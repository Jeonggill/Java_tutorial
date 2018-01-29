
public class BinarySearch {

	public static int binarySearch (int data[], int key) {
		int low = 0, middle = 0, high = data.length -1;
		// high�� low���� �۾����ٸ� ã������ �����Ͱ� ������ ���տ� ����.
		
		while (low <= high) {
			// �߾Ӱ��� low�� high�� ���� ���� 2�� ������ �ȴ�.
			middle = (low + high) / 2; 
			
			// �߾Ӱ��� ã������ ���� ��ġ�ϸ� middle�� �����Ѵ�.
			if (key == data[middle]) return middle;
			
			// ���� ã������ ���� �߾Ӱ����� ũ�ٸ� low�� middle + 1�� �д�.
			else if (key > middle + 1) low = middle + 1; //middle + 1�� ¦���� ��쿡
			
			// ���� ã������ ���� �߾Ӱ����� �۴ٸ� high�� middle - 1�� �д�.						
			else high = middle - 1; 
			}
		
		return -1; // Ž���� �����ϸ� -1 ��ȯ 
	}
	public static void main(String[] args) {
		int searchKey = 3; 
		int intValue[] = { 4, 8, 3, 1, 6, 2 }; 
		System.out.println("���� Ž��"); 
		System.out.printf("ã����ġ = %d��°\n", binarySearch(intValue, searchKey)); 
	}
}
