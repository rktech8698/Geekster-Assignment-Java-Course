package geekster_assignment;

import java.util.*;

class AsciiDistance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Character of your choice:");

		char ch=sc.nextLine().charAt(0);
		System.out.println(" Difference :");
		int d=sc.nextInt();
		char out = (char)(ch+d);
		System.out.println(out);

	}

}
