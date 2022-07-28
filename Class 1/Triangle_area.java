package Lec1;

public class Triangle_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3,b = 4, c = 5;
		int s = (a+b+c)/2;
		int area = s*(s-a)*(s-b)*(s-c);
		System.out.println(Math.sqrt(area));
		

	}

}
