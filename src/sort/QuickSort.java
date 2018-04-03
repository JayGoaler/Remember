package sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {1,12,6,5,89,52,12,2};
		
		quickSort(arr, 0, arr.length-1);
		
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}
	
	public static void  quickSort(int[] arr,int low,int high) {
		int i,j,t,temp;
		if(low>high) {
			return;
		}
		i=low;
		j=high;
		temp=arr[low];
		while(i<j) {
			//从右边开始检查，找出比temp小的
			while(temp<=arr[j]&&i<j) {
				j--;
			}
			//从左边开始，找出比temp大的
			while(temp>=arr[i]&&i<j) {
				i++;
			}
			if(i<j) {
				t=arr[j];
				arr[j]=arr[i];
				arr[i]=t;
			}
		}
		arr[low] = arr[i];
		arr[i] = temp;
		
		quickSort(arr,low,low-1);
		
		quickSort(arr,j+1,high);
	}
}
