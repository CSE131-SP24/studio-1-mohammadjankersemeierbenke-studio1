package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Input the first of two integers to be averaged?");
double n1 = in.nextDouble();
System.out.println("Input the second of two integers to be averaged?");
double n2 = in.nextDouble();
System.out.println("Average of these two numbers is "+(n1+n2)/2);}}