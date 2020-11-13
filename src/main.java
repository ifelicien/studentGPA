import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String sName = nameFinder();
        display(sName)
        ;
    }

    static String nameFinder(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the students name: ");

        for(int i = 0;i < 6;i++) {
            String studentName = myScanner.nextLine();

            return studentName;
        }
        return null;
    }

    static void display(String name){
        System.out.println(name);
    }
}


