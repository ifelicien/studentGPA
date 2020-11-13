import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class main {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        int[] count = {1,2,3,4,5,6};


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the students name: ");

        for(int i = 0;i < 6;i++) {
            String studentName = myScanner.next();
            studentNames.add(studentName);
        }

        System.out.println("\n\n" + count[0] + ". " + studentNames.get(0));
        System.out.println(count[1] + ". " + studentNames.get(1));
        System.out.println(count[2] + ". " + studentNames.get(2));
        System.out.println(count[3] + ". " + studentNames.get(3));
        System.out.println(count[4] + ". " + studentNames.get(4));
        System.out.println(count[5] + ". " + studentNames.get(5));
    }
}


