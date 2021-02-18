import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
int roll,math,phy,eng,chem,bio;
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
name=s.nextLine();
System.out.println("enter rollno:");
roll=s.nextInt();
System.out.println("enter math:");
math=s.nextInt();
System.out.println("enter phy:");
phy=s.nextInt();
System.out.println("enter eng:");
eng=s.nextInt();
System.out.println("enter chem:");
chem=s.nextInt();
System.out.println("enter bio:");
bio=s.nextInt();
int total=math+phy+eng+chem+bio;
System.out.println("rollno:"+ roll+"\tname:"+name);
System.out.println("total:"+total);


	}

}
