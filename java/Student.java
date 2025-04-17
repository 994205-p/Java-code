public class Student {
    class StudentInfo {
        int id;
        String name;

        StudentInfo(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("id: " + id + ",    name: " + name);
        }
    }

    Student() {
        System.err.println("Hii");
    }

    public static void main(String[] args) {
        Student outerStudent = new Student();

        Student.StudentInfo innerStudent = outerStudent.new StudentInfo(1, "Priyanka");

        innerStudent.display();
    }
}
