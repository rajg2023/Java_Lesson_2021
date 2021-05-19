/**
 * 
 */
package javaThreads;

/**
 * @author raj
 *
 */
//Executed results of thread always have different results.
public class ThreadApps {

	
	public static void main(String[] args) {
		System.out.println("==Application Started==");
		//MyTask task = new MyTask();
		//task.executeTask();
		Runnable run = new MyTask();
		Thread task = new Thread(run);
		task.start();
		
		Thread MyTask2 = new Thread(new MyTask2());
		MyTask2.start();
		
		for(int print=1; print<=12; print++) {
			System.out.println("@@ Application print number #  " +print + " - at Printer1");
		}
		
		
		System.out.println("==Application Completed==");

	}

}

final class MyTask extends Thread implements Runnable{
	@Override
	public void run() {
		for(int print=1; print<=12; print++)
		System.out.println("@@ Application print number #  " + print + "  - at Printer2");
	}
}



final class MyTask2 implements Runnable{
	@Override
	public void run() {
		for(int print=1; print<=12; print++)
		System.out.println("@@ Application print number #  " + print + "  - at Printer3");
	}
}