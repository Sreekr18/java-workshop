public class StringExample {
    public static void main(String[] args) {
        String FirstName = "Sree";
        String LastName = "Krishnan";
        String ExtraName = " R";
        String FinalName = FirstName.concat(LastName).concat(ExtraName);
        System.out.println("Concatenated String: " + FinalName);
        String UpperCase = FinalName.toUpperCase();
        System.out.println("Uppercase String: " +UpperCase);
        
        
    
}
}
