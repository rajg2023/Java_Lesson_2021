/**
 * 
 */
package arraySearching;

/**
 * @author myubuntu
 *
 */
public class BubbleSort {
//compare the adjacent element and sort/swap them.
	static void sort(int[] arr) {
		int len = arr.length;
		for(int i = 0; i<len-1; i++) {
			for(int j =0; j<len-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]arr = {4, 1, 10, -3, 12};
     BubbleSort.sort(arr);
     for(int elm : arr) {
    	 System.out.print(elm+ " ");
     }
	}

}
