package vetias.java.workshop.basics;

public class TotalMarks {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        System.out.println("Total Marks: " + total);
    }
}
