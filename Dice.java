import java.util.Random;

public class Dice
{
public static void main (String[] args)
{
Random generator = new Random();
int num1, num2;
float sum;

num1=generator.nextInt(6)+1;
num2=generator.nextInt(6)+1;
sum=num1+num2;

System.out.println("Number1 from a die="+num1);
System.out.println("Number2 from a die="+num2);
System.out.println("The total roll="+sum);
}
}