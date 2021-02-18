import java.util.Scanner;

public class Greatestofthree {

	public static void main(String[] args) {
	
	
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if (a>b&&a>c)
		{
			System.out.println(a+ " is greatest");
		}
		else if(b>c)
		{
				System.out.println(b+ " is Greatest");
		}
		else
		{
			System.out.println(c+ " is Greatest");
			}

		}

	}
