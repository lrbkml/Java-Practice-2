import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        
        Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher = pattern.matcher(x);
        boolean found = matcher.find();
        System.out.println(found);


    }
}
