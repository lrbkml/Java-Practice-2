import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      String a = "hey how are you";
        for(int i=a.length()-1 ; i>=0; i--)
        {
            System.out.print(a.charAt(i));
        }

    }
    
}
