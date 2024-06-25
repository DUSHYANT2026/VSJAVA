// import java.util.Scanner;

// public class bank {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("ENTER THE LENGHT, HEIGHT, WIDTH, AND LAST RADIUS: ");
//         int length = scanner.nextInt();
//         int height = scanner.nextInt();
//         int width = scanner.nextInt();
//         int radius = scanner.nextInt();

//         Area newArea = new Area(length, height, width, radius);

//         int option;
//         do {
//             System.out.println("Choose an option: FOR WICH YOU NEED THE AREA");
//             System.out.println("1. Area of Circle");
//             System.out.println("2. Area of Square");
//             System.out.println("3. Area of Rectangle");
//             System.out.println("4. Area of Cone");
//             System.out.println("5. Area of Triangle");
//             System.out.println("6. Exit From the Meanu driven programme");

//             option = scanner.nextInt();

//             switch (option) {
//                 case 1:
//                     newArea.areaofcircle();
//                     break;
//                 case 2:
//                     newArea.areaofsqure();
//                     break;
//                 case 3:
//                     newArea.areaofrectangle();
//                     break;
//                 case 4:
//                     newArea.areaofcone();
//                     break;
//                 case 5:
//                     newArea.areaoftriangle();
//                     break;
//                 case 6:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Invalid option");
//             }
//         } while (option != 6);

//         scanner.close();
//     }
// }

// class Area {
//     int length;
//     int width;
//     int height;
//     int radius;

//     Area(int l, int w, int h, int r) {
//         length = l;
//         width = w;
//         height = h;
//         radius = r;
//     }

//     void areaofcircle() {
//         double ans = (22.0 / 7) * radius * radius;
//         System.out.println("Area of Circle: " + ans);
//     }

//     void areaofsqure() {
//         int ans = length * length;
//         System.out.println("Area of Square: " + ans);
//     }

//     void areaofrectangle() {
//         int ans = length * width;
//         System.out.println("Area of Rectangle: " + ans);
//     }

//     void areaofcone() {
//         double ans = (22.0 / 7) * radius * (radius + Math.sqrt(radius * radius + height * height));
//         System.out.println("Area of Cone: " + ans);
//     }
//     void areaoftriangle(){
//         double ans = (0.5) * length * height;
//         System.out.println("Area Of The Triangle: " + ans);
//     }
// }






// import java.util.Scanner;
// public class bank {
//     boolean check(long n){
//         long x = n;
//         long ans = 0;
//         while(x != 0){
//             ans = ans*10 + x%10;
//             x = x/10;
//         }
//         return ans == n;
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         long n = scanner.nextLong();
        
//         bank m  = new bank(); 
//         if(m.check(n)){
//             System.out.println("THE NUMBER THAT YOU ENTERS IS PALINDROME:  " + n);
//         }else{
//             System.out.println("NOT A PALINDROME:  ENTERS ANOTHER NUMBER AND THEN CHECK");
//         }
//     }
// }







// import java.util.Scanner;
// public class bank {
//     long factorial(long n){
//         int ans = 1;
//         for(int i=1;i<=n;i++){
//             ans *= i;
//         }
//         return ans;
//     }
//     long biggestdigit(long n){
//         long ans = Long.MIN_VALUE;
//         while(n != 0){
//             long x = n%10;
//             ans = Math.max(ans,x);
//             n = n/10;
//         }
//         return ans;
//     }
//     long smallestdigit(long n){
//         long ans = Long.MAX_VALUE;
//         while(n != 0){
//             long x = n%10;
//             ans = Math.min(ans,x);
//             n = n/10;
//         }
//         return ans;
//     }
//     long table(long n){
//         long x = n;
//         for()
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         long n = scanner.nextLong();
//         bank b = new bank();

//         // FACTORAIL OF THE GIVEN NUMBER: 
//         // System.out.println("THE FACTORAIL OF THE NUMBER THAT YOU ENTERS :  "+ b.factorial(n));

//         // BIGGEST AD THE SMALLEST DIGITS IN A NUMBER:
//         // System.out.println("THE BIGGEST DIGIT  OF THE NUMBER THAT YOU ENTERS :  "+ b.biggestdigit(n));
//         // System.out.println("THE SMALLEST DIGIT  OF THE NUMBER THAT YOU ENTERS :  "+ b.smallestdigit(n));

//     }
// } 




// public class bank {
//     public static void main(String[] args) {
//         nenwthread king = new nenwthread();
//         king.start();
//         for(int i=1; i<=5; i++){
//             System.out.println("THIS CALL IN SIMPLE MAIN CALLS PUBLIC STATIC VOID MAIN");
//         }
//     }
// }
// class nenwthread extends Thread {
//     public void run() {
//         for(int i=1;i<=10;i++)
//         System.out.println("king of kings CALL USING THREADING");
//     }
// }





// // Java program to demonstrate multithreading using different callables
// public class bank {

//     // A dummy function using Runnable
//     static class RunnableTask implements Runnable {
//         private int count;

//         RunnableTask(int count) {
//             this.count = count;
//         }

//         public void run() {
//             for (int i = 0; i < count; i++) {
//                 System.out.println("Thread using Runnable interface as callable");
//             }
//         }
//     }

//     // A callable object using Thread
//     static class ThreadTask extends Thread {
//         private int count;

//         ThreadTask(int count) {
//             this.count = count;
//         }

//         public void run() {
//             for (int i = 0; i < count; i++) {
//                 System.out.println("Thread using Thread class as callable");
//             }
//         }
//     }

//     // A callable object using Callable interface
//     static class CallableTask implements java.util.concurrent.Callable<String> {
//         private int count;

//         CallableTask(int count) {
//             this.count = count;
//         }

//         public String call() {
//             for (int i = 0; i < count; i++) {
//                 System.out.println("Thread using Callable interface as callable");
//             }
//             return "Callable Done";
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("Threads 1, 2, 3, 4, and 5 operating independently");

//         // Thread using Runnable interface as callable
//         Thread th1 = new Thread(new RunnableTask(3));

//         // Thread using Thread class as callable
//         Thread th2 = new ThreadTask(3);

//         // Thread using lambda expression as callable
//         Thread th3 = new Thread(() -> {
//             for (int i = 0; i < 3; i++) {
//                 System.out.println("Thread using lambda expression as callable");
//             }
//         });

//         // Thread using non-static member function as callable
//         bank demo = new bank();
//         Thread th4 = new Thread(demo::nonStaticMethod);

//         // Thread using static member function as callable
//         Thread th5 = new Thread(bank::staticMethod);

//         // Start all threads
//         th1.start();
//         th2.start();
//         th3.start();
//         th4.start();
//         th5.start();

//         // Wait for all threads to finish
//         try {
//             th1.join();
//             th2.join();
//             th3.join();
//             th4.join();
//             th5.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }

//     // Non-static member function
//     public void nonStaticMethod() {
//         System.out.println("Thread using non-static member function as callable");
//     }

//     // Static member function
//     public static void staticMethod() {
//         System.out.println("Thread using static member function as callable");
//     }
// }
