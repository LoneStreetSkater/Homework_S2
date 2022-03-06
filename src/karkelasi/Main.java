package karkelasi;



public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee() {
            @Override
            public void employee() {
                System.out.println("Employee");
            }
        };
        Student std = new Student() {
            @Override
            public void student() {
                System.out.println("Student");
            }
        };
        Teacher tea = new Teacher() {
            @Override
            public void teacher() {
                System.out.println("Teacher");
            }
        };
        emp.employee();
        tea.teacher();
        std.student();
    }
}