import java.util.Random;
class EvenThread extends Thread{
    private int num;
    public EvenThread(int num){
        this.num = num;
    }
    public synchronized void run(){
        System.out.println("Square of "+ num + "is" + num*num);
    }

}

class OddThread extends Thread{
    private int num;
    public OddThread(int num){
        this.num = num;
    }
    public synchronized void run(){
        System.out.println("Cube of"+ num + "is" + num*num*num);
    }
}

class Randomethread extends Thread{
    public void run(){
        Random r = new Random();
        for(int i = 0;i<10; i++){
            int num = r.nextInt(100);
            if (num%2 == 0){
                new EvenThread(num).start();
            } 
            else{
                new OddThread(num).start();
            }
        }
    }
}

public class Threadtrial{
    public static void main(String [] args){
        Randomethread r = new Randomethread();
        r.start();
    }
}