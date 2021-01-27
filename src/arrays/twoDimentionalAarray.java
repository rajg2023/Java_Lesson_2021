/**
 * 
 */
package arrays;

/**
 * @author myubuntu
 *
 */
public class twoDimentionalAarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][]= {{1,2,3,4,5},{6,7,8,9,10}};
    // int i defines the rows
    for(int i=0; i<2;i++) {
    // int j defines the columns
    	for(int j=0; j<5; j++) {
    		System.out.print(arr[i][j]+" ");
    		
    	}
    	
    	System.out.println();
    }
	}

}
