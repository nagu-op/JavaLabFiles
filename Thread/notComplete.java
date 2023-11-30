

/* Q) write a java program that create three threads.
 *  First thread generates a random positive number(>1) every 1 second. 
 *  If the number is even,
 *  the second thread prints all even numbers between 1 and the generated number.
 *  If the number is odd, the third thread will print all odd numbers between 1 and the generated number.
*/


package a;
import java.awt.im.spi.InputMethodDescriptor;
import java.util.Random;

class NumberManager{
	private int generatedNumber;
	private boolean numberGenerated = false;
	public synchronized void generateNumber(){
		generatedNumber = new Random().nextInt(99)+2;
		System.out.println("Generated randome number"+generatedNumber);
		numberGenerated = true;
		notifyAll();
}
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber %2 != 0) {
			wait();
		}
		for(int i = 2; i<=generatedNumber; i+=2) {
			System.out.print
			(i+" ");
		}
		System.out.println("\n");
		numberGenerated = false;
	}
	public synchronized void printOddNumbers() throws InterruptedException {
		while(!numberGenerated || generatedNumber %2 == 0) {
			wait();
		}
		for(int i = 2; i<=generatedNumber; i+=2) {
			System.out.println(i+"");
		}
		numberGenerated = false;
	}
}
class NumberGenerator extends Thread{
	
	NumberManager numberManager;
	public NumberGenerator(NumberManager numberManager) {
		this.numberManager = numberManager;
		
	}
	public void run() {
		while(true) {
			numberManager.generateNumber();	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
	
}
class EvenPrinterThread extends Thread{
	NumberManager numberManager;
	public EvenPrinterThread(NumberManager numberManager) {
		this.numberManager = numberManager;
	}
	public void run() {
		while(true) {
			try {
				numberManager.printEvenNumbers();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Trial {
	public static void main(String [] args) {
		NumberManager numberManager = new NumberManager();
		NumberGenerator numberGenerator = new NumberGenerator(numberManager);
		EvenPrinterThread evenPrinterThread = new EvenPrinterThread(numberManager);
		numberGenerator.start();
		evenPrinterThread.start();
		
		
	}
}
