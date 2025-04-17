public class Nestedif{
public static void main(String args[]){

int a=2021;

if((a%4 == 0 && a%100 != 0) || (a%400 == 0)){
System.out.println("It is leap year");
}
else{
System.out.println("It is not a leap year");
}
}
}