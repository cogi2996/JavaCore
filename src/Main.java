import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = myObj.nextLine();
		int age = myObj.nextInt();
		double salary =myObj.nextDouble();
		System.out.println(name + " " + age + " " + salary);
	}
}