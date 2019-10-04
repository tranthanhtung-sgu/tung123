package Queue;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		int n;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		Queue q = new Queue();
		System.out.println("nhap vao so hang doi trong Queue : ");
		n = scanner.nextInt();
		int temp = 0;
		while(i<(n+1) && temp<(n*n)) {
		// Ham Random Ten Xe
		String[] objects = { "Honda", "Mecedes-Benz", "Mazda", "Lexus" };

	       int length = objects.length;
	       
	           int rand = (int) (Math.random() * length);

	        // Radom ID XE
	           Random rd = new Random();   // khai báo 1 đối tượng Random
	   			int number = rd.nextInt(100);
	   			Cars xe = new Cars(objects[rand], number);
	   			System.out.println("Thong bao co them xe vua vao Queue ");
	   			q.enqueue(xe);
	   			i++;
				if(i==n) {
	   				System.out.println("Xe " +q.dequeue().data+ " ra khoi Queue : ");
					//q.dequeue();
	   				i--;
	   	
	   			}
	   			q.displayLinkedList();
	   			temp++;
		}
		
		//q.displayLinkedList();
	}
}
