import java.util.LinkedList;
import java.util.Scanner;

class DoublyLinkedList<T>{
    private LinkedList<T> list = new LinkedList<>();
    public void InsertAtFront(T element){
        list.addFirst(element);
    }
    public void  InseretAtLast(T element){
        list.addLast(element);
    }
    public void dispaly(){
        for (T element: list){
            System.out.println(element+" ");
        }
    }
}

public class linkedList{
    public static void main(String [] args){
        DoublyLinkedList<Integer> l = new DoublyLinkedList<Integer>();
        int ch = 1,element;
        Scanner sc = new Scanner(System.in);
        while(ch != 0){
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            if (ch == 1){
                System.out.println("Enter the element: ");
                element = sc.nextInt();
                l.InsertAtFront(element);

            }
            else if (ch == 2){
                System.out.println("Enter the element: ");
                element = sc.nextInt();
                l.InseretAtLast(element);

            }
            else if (ch == 3){
                l.dispaly();

            }
        }
    }
}
