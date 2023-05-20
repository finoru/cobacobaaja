import java.util.Scanner;

public class RolesHeroesLevel_1402022070 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String datum1 = "";
        String datum2 = "";
        datum1 = userInput.next();
        datum2 = userInput.next();
        char x = datum1.charAt(0);
        char y;
        do{
            y = datum2.charAt(datum2.length() - 1);
            datum1 = datum1.substring(1);
            datum2 = datum2.substring(0, (datum2.length() - 1));
            System.out.println("char x: " + x);
            System.out.println("char y: " + y);
        } while(y == x);

        System.out.print(datum1.charAt(0));

    }
}