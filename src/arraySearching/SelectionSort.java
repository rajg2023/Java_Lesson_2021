package arraySearching;

public class SelectionSort {
	//compare the adjacent element and sort/swap them.
		static void sort(int[] arr) {
			int len = arr.length;
			for(int i = 0; i<len-1; i++) {
			//Assuming minimum element in the ith index.
				int minIdx = i;
				for(int j=i+1; j<len; j++) {
					if(arr[j] < arr[minIdx]) {
						minIdx = j;
					}
				}
				//Swap min element with first element
				int temp = arr[minIdx];
				arr[minIdx]= arr[i];
				arr[i]=temp;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]arr = {4, 1, 10, -3, 12};
	     SelectionSort.sort(arr);
	     for(int elm : arr) {
	    	 System.out.print(elm+ " ");
	     }
	}

}
