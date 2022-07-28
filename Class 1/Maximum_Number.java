package Lec1;
import java.util.Scanner;

public class Maximum_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A, B and C");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}

	}

}
