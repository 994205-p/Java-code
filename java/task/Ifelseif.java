public class Ifelseif{
public static void main(String args[]){

int marks=75;

 if (marks >= 90 && marks <= 100) {
 System.out.println("A Grade");
 } 
 else if (marks >= 80 && marks <= 89) {
 System.out.println("B Grade");
 } 
 else if (marks >= 70 && marks <= 79) {
 System.out.println("C Grade");
 } 
 else if (marks >= 60 && marks <= 69) {
 System.out.println("D Grade");
 }
 else if (marks < 60) {
 System.out.println("Fail");
 }
 else {
 System.out.println("Invalid marks entered.");
  }
}
}