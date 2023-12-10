import java.util.Scanner;

class Student {
    private String name;
    private String reg;
    private int total;
    private int[] attended;

    public Student(String name, String reg) {
        this.name = name;
        this.reg = reg;
        this.total = 0;
        this.attended = new int[10];
    }

    public String getName() {
        return name;
    }

    public String getReg() {
        return reg;
    }

    public int getTotal() {
        return total;
    }

    public int[] getAttended() {
        return attended;
    }

    public void markAttendance(int day) {
        if (day >= 0 && day < attended.length) {
            attended[day]++;
            total++;
        }
    }

    public double calculateAttendancePercentage(int numDays) {
        if (numDays == 0) {
            return 0.0;
        } else {
            double sum = 0;
            for (int i = 0; i < total; i++) {
                sum += attended[i];
            }
            return (sum / (numDays)) * 100.0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = s.next();
            System.out.print("Register number: ");
            String reg = s.next();
            students[i] = new Student(name, reg);
        }

        System.out.print("Enter the number of days to track attendance: ");
        int numDays = s.nextInt();

        int day = 0;
        do {
            System.out.println("Day " + (day + 1) + " Attendance:");

            for (int i = 0; i < 3; i++) {
                System.out.print("Mark attendance for " + students[i].getName() + ": ");
                char attendance = s.next().charAt(0);

                switch (attendance) {
                    case 'P':
                    case 'p':
                        students[i].markAttendance(day);
                        System.out.println(students[i].getName() + " is marked present.");
                        break;
                    case 'A':
                    case 'a':
                        System.out.println(students[i].getName() + " is marked absent.");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }

            day++;
        } while (day < numDays);

        for (int i = 0; i < 3; i++) {
            System.out.println("Attendance Details for " + students[i].getName());
            System.out.println("Total Classes: " + students[i].getTotal());
            System.out.println("Attendance Percentage: " + students[i].calculateAttendancePercentage(numDays) + "%");
        }
    }
}
