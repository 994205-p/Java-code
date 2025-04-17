public class Bitwiseoperation{
    public static void main(String[] args) {
        int a = 5; 
        int b = 3; 

        int and = a & b; 
        System.out.println("a & b = " + and);

        int or = a | b; 
        System.out.println("a | b = " + or);

        int xor = a ^ b; 
        System.out.println("a ^ b = " + xor);

        int not = ~a;
        System.out.println("~a = " + not);

        int leftShift = a << 1; 
        System.out.println("a << 1 = " + leftShift);

        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift);

        int unsignedRightShift = a >> 2;
        System.out.println("a >> 2 = " + unsignedRightShift);
    }
}
