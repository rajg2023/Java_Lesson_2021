/**
 * 
 */
package arrays;

/**
 * @author myubuntu
 *
 */
public class multiDimentionalAarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][]= {{1,2,3,4,5},{6,7,8,9,10}, {11,12,13,14,15}};
    // int i defines the rows
    for(int i=0; i<3;i++) {
    // int j defines the columns
    	for(int j=0; j<5; j++) {
    		
    		System.out.print(arr[i][j]+" ");
    		
    	}
    	
    	System.out.println();
    }
	}

}
