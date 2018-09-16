import java.util.Scanner;

public class Wrapper {
	public static void main (String[] args){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	Integer integer = scan.nextInt();
	String bi = integer.toBinaryString(integer);
	String hex = integer.toHexString(integer);
	String oct= integer.toOctalString(integer);
	System.out.println("The binary representation of the integer is: " + bi);
	System.out.println("The hexadecimal representation of the integer is: " + hex);
	System.out.println("The octal representation of the integer is: " + oct);
	System.out.println("The maximum integer value is: " + Integer.MAX_VALUE);
	System.out.println("The minimum integer value is: " +Integer.MIN_VALUE);
	System.out.print("Enter a decimal integer:");
	String decimal1= scan.next();
	System.out.print("Enter another decimal integer:");
	String decimal2= scan.next();
	double int1 = Double.parseDouble(decimal1);
	double int2 = Double.parseDouble(decimal2);
	int dec1 = (int) int1;
	int dec2= (int) int2;
	int sum = dec1 + dec2;
	System.out.println("The sum of the decimals as integers is: " + sum);
		
	}
}