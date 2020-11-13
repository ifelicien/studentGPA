import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        nameFinder();
    }

    static String nameFinder(){
        int i = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the students name: ");

        do {
            String studentName = myScanner.nextLine();

            i++;
            return studentName;
        }
        while(i < 6);
    }
}
