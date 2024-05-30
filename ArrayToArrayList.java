import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] Array = {"Array","To","ArrayList","Convertion","Yash", "Chauhan","Intern","DME"};

        // Method 1
        ArrayList<String> ArrayList1 = new ArrayList<>(Arrays.asList(Array));
        System.out.println(ArrayList1);

        // Method 2
        ArrayList<String> ArrayList2 = new ArrayList<>();
        Collections.addAll(ArrayList2,Array);
        System.out.println(ArrayList2);

        // Method 3
        ArrayList<String> ArrayList3 = new ArrayList<>();
        for( String iterate : Array){
            ArrayList3.add(iterate);
        }
        System.out.println(ArrayList3);
    }
}
