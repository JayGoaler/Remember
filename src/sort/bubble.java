package sort;

public class bubble {

	public static void main(String[] args) {
		int[] i = {1,5,32,11,56,2,121,22,0};
		
		sort(i);
		
		for (int j : i) {
			System.out.print(j+"\t");
		}
	}

	public static void sort(int[] arr) {
		int temp = 0;
		for (int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
