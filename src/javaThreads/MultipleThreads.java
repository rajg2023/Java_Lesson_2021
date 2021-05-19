package javaThreads;




class Printer{
	
synchronized void printDocuments(int numOfCopies, String docName) {
		for(int i = 0; i<=numOfCopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(">> Printing Document "+docName +" "+i);
		}
			
		
	}
}


class MyThread extends Thread{
	
	Printer pRef;
	
	MyThread(Printer p){
	pRef = p;	
		
	}
	
	@Override
	public void run() {
		pRef.printDocuments(10, "Raj's documents from Class MyThread");
	}
}





class MyThread2 extends Thread{
	
	Printer pRef;
	
	MyThread2(Printer p){
	pRef = p;	
		
	}
	
	@Override
	public void run() {
		pRef.printDocuments(10, "Raj's documents from Class MyThread2");
	}
}




public class MultipleThreads {

	public static void main(String[] args) {
		System.out.println("==Application Started==");
		
		Printer printer = new Printer();
		printer.printDocuments(10, "Raj's Documents from Class MultipleThreads");
		
		MyThread mRef = new MyThread(printer);
		mRef.start();
		/*
		 * try { mRef.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		
		MyThread2 mRef2 = new MyThread2(printer);
		/*
		 * mRef2.start(); try { mRef2.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		System.out.println("==Application Completed==");

	}

}
