public class EmployeeDetailsArray {
    public static void main(String[] args) {
        String[][] employees=new String[5][2];
        employees[0][0] = "101";
        employees[0][1] = "Anand";
        employees[1][0] = "102";
        employees[1][1] = "Bharat";
        employees[2][0] = "103";
        employees[2][1] = "Ram";
        employees[3][0] = "104";
        employees[3][1] = "Dinesh";
        employees[4][0] = "105";
        employees[4][1] = "Suresh";
        System.out.println("Employee Details:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Roll No: " + employees[i][0] + ", Name: " + employees[i][1]);
        }

    }
    
}
