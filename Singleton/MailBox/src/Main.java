import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ViewManager viewManager = new ViewManager();
        Scanner input = new Scanner(System.in);
        int selected = 1;

        while( selected != 0){

            System.out.print("\n\n");
            System.out.println("First View -> 1");
            System.out.println("Second View -> 2");
            System.out.println("Third View -> 3");
            System.out.println("Exit -> 0");
            System.out.print("Seçim : "); selected = input.nextInt();

            if(selected != 0){
                System.out.print("\n\n");
                viewManager.getView(selected);
            }

        }
        System.out.println("Çıkış yapıldı.");
    }
}
