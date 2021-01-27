package arraySearching;

public class InsertionSort {
	//compare the adjacent element and sort/swap them.
		static void sort(int[] arr) {
			int len = arr.length;
			for(int i = 0; i<len; i++) {
			int key = arr[i];
			int j = i-1;
			//moving elements greater than "key" position ahead of their current position 
				while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j=j-1;
				}
				arr[j+1] = key;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]arr = {4, 1, 10, -3, 12};
	     InsertionSort.sort(arr);
	     for(int elm : arr) {
	    	 System.out.print(elm+ " ");
	     }
	}

}
