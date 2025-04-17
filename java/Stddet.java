class Std{
    private float cgpa;
    Std(float cgpa){
        this.cgpa = cgpa;
    }
    void Std(int rollno, int age){
        System.out.println("Rollno: " +rollno);
        System.out.println("Age: " +age);
    }
    void display(float cgpa){
        System.out.println("CGPA: " +cgpa);
    }
}
public class Stddet{
    public static void main(String[] args) {
        Std a = new Std(System.in);
        int c = a.nextFloat();

    }
}