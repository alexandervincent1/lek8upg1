import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        
        
        int[] array = new int[5];
        for(int index=4; index<=array.length && index>=0; index--)
        {
        System.out.println("Skriv in tal "+index);
        array[index]=tangentbord.nextInt();
        }
    }
}
