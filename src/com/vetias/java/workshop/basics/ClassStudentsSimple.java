import java.util.Scanner;

public class ClassStudentsSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[][] students = new String[count][2];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Roll No and Name for student " + (i + 1) + " (e.g., 101 John): ");
            String line = scanner.nextLine();
            String[] parts = line.split(" ", 2);
            students[i][0] = parts[0];
            students[i][1] = parts.length > 1 ? parts[1] : ""; 
        }

        System.out.println("\n--- Student List ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Roll No: " + students[i][0] + ", Name: " + students[i][1]);
        }

        scanner.close();
    }
}
