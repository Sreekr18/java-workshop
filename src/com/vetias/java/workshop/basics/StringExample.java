import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String FirstName = "Sree";
        String LastName = "Krishnan";
        String ExtraName = " R";
        String FinalName = FirstName.concat(LastName).concat(ExtraName);
        System.out.println("Concatenated String: " + FinalName);
        String UpperCase = FinalName.toUpperCase();
        System.out.println("Uppercase String: " +UpperCase);
       
        String Sentence="This program shows how can we split a string into multiple strings";
        String[] words = Sentence.split(" "); 
        for (String word : words) {
            System.out.println(word);
        }
     
        
       
        System.out.println(words.length);

        System.out.println(Arrays.toString(words));
    
}
}
