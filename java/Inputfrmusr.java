import java.util.Scanner;
public class Inputfrmusr{
public static void main(String args[]){

int a;
float b;
short c;
long d;
double e;
char f;
boolean g;
byte h;

Scanner sc=new Scanner(System.in);

System.out.println("Enter the int value: ");
a=sc.nextInt();
System.out.println("Enter the float value: ");
b=sc.nextFloat();
System.out.println("Enter the short value: ");
c=sc.nextShort();
System.out.println("Enter the long value: ");
d=sc.nextLong();
System.out.println("Enter the double value: ");
e=sc.nextDouble();
System.out.println("Enter the char value: ");
f=sc.next().charAt(0);
System.out.println("Enter the boolean value: ");
g=sc.nextBoolean();
System.out.println("Enter the byte value: ");
h=sc.nextByte();



System.out.println("The int value is:" +a);
System.out.println("The float value is:" +b);
System.out.println("The short value is:" +c);
System.out.println("The long value is:" +d);
System.out.println("The double value is:" +e);
System.out.println("The char value is:" +f);
System.out.println("The boolean value is:" +g);
System.out.println("The byte value is:" +h);
   }
}