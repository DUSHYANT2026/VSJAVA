import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("ALL THE NUMBER OF GIVEN RANGE:");
        for(int i=1;i<=n;i++){ 
            System.out.println(i);
        }

        System.out.println();
        System.out.println("ALL THE EVEN NUMBER OF GIVEN RANGE:");
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("ALL THE  ODD NUMBER OF GIVEN RANGE:");
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("ALL THE ALTERNATE 1 AND -1 WITH IN THE GIVEN RANGE:");
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }        
    }
}


