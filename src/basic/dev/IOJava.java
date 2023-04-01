package basic.dev;

import java.util.Scanner;

public class IOJava {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Nhập thông tin cho Sinh Viên thứ nhất:");
		System.out.println("Tên sinh viên:");
		String firstName = scanner.nextLine();
		
		System.out.println("MSV:");
		String msv = scanner.nextLine();
		
		System.out.println("Tên lớp:");
		String tenLop = scanner.nextLine();
		System.out.println("Tên trường:");
		String tenTruong = scanner.nextLine();
		System.out.println("Chào bạn: " + firstName + " - mã sinh viên: " + msv );

	}

}
