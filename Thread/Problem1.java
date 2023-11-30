package a;
class MultiplicationTable{
	synchronized void printMultiplicatoinTable(int number) {
			for(int i = 1 ; i<=100000000; i++) {
				System.out.println(i+" x "+number+" = "+i*number);
			}
	}
}
class MyThread1 extends Thread{
	MultiplicationTable t ;
	MyThread1(MultiplicationTable t){
		this.t = t;
	}
	public void run() {
		t.printMultiplicatoinTable(50000);
	}
}
class MyThread2 extends Thread{
	MultiplicationTable t ;
	MyThread2(MultiplicationTable t){
		this.t = t;
	}
	public void run() {
		t.printMultiplicatoinTable(10000);
	
	}
}

public class b{

	public static void main(String []args) {
	
		MultiplicationTable m = new MultiplicationTable();
		MyThread1 t = new MyThread1(m);
		t.start();
		MyThread2 t2 = new MyThread2(m);
		
		
		t2.start();
	}
}
