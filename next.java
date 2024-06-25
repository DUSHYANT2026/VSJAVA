// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class CharacterCompression {
//     public static ArrayList<Character> compress(ArrayList<Character> chars) {
//         if (chars.size() == 0) return new ArrayList<>();

//         Map<Character, Integer> mapp = new HashMap<>();
//         for (char c : chars) {
//             mapp.put(c, mapp.getOrDefault(c, 0) + 1);
//         }

//         StringBuilder compressedString = new StringBuilder();
//         for (Map.Entry<Character, Integer> entry : mapp.entrySet()) {
//             compressedString.append(entry.getKey());
//             compressedString.append(entry.getValue());
//         }

//         ArrayList<Character> compressedList = new ArrayList<>();
//         for (char c : compressedString.toString().toCharArray()) {
//             compressedList.add(c);
//         }

//         return compressedList;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         ArrayList<Character> chars = new ArrayList<>();

//         System.out.print("Enter the number of characters: ");
//         int n = scanner.nextInt();

//         System.out.println("Enter the characters:");
//         for (int i = 0; i < n; i++) {
//             char x = scanner.next().charAt(0);
//             chars.add(x);
//         }

//         ArrayList<Character> ans = compress(chars);

//         System.out.print("Compressed Result: ");
//         for (char c : ans) {
//             System.out.print(c);
//         }
//     }
// }



// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         long n = scanner.nextLong();

//         long x = n;
//         long ans = 0;
//         while (n != 0) {
//             long digit = n % 10;
//             ans = ans * 10 + digit;
//             n = n / 10;
//         }
//         System.out.println("NUMBER BEFORE Reversed Number: " + x);
//         System.out.println("NUMBER AFTER Reversed Number: " + ans);
        
//     }
// }



// import java.util.*;
// import java.util.Scanner;
// public class Main {
//     public static void pattern1(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//     }
//     public static void pattern2(int n){
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//     }
//     public static void pattern3(int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//     }
//     public static void pattern4(int n){
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n-1;j++){
//                 System.out.print(' ');
//             }
//             for(int j=0;j<2*i+1;j++){
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//     }
//     public static int revresenumber(int n){
//         int ans = 0;
//         while(n !=0 ){
//             int x = n%10;
//             ans = ans*10 + x;
//             n = n/10;
//         }
//         return ans;
//     }
//     public static int factorial(int n){
//         int ans = 1;
//         for(int i=1;i<=n;i++){
//             ans *= i;
//         }
//         return ans;
//     }
//     public static boolean angstrom(int n){
//         int check = n;
//         int sum = 0;
//         while(n != 0){
//             int x = n%10;
//             sum += Math.pow(x, 3);
//             n = n/10;
//         }
//         return sum == check;
//     }
//     public static boolean strongnumber(int n){
//         int check = n;
//         int sum = 0;
//         while(n != 0){
//             int x = n%10;
//             sum += factorial(x);
//             n = n/10;
//         }
//         return check == sum;
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();
        
//         // pattern1(n);
//         // System.out.println();
//         // pattern2(n);
//         // System.out.println();
//         // pattern3(n);
//         // System.out.println();
//         // pattern4(n);
//         // System.out.println(revresenumber(n));
//         // System.out.println(factorial(n));

//         // if (angstrom(n)) {
//         //     System.out.println("THE NUMBER IS ARMSTRONG: " + n);
//         // } else {
//         //     System.out.println("THE NUMBER IS NOT ARMSTRONG: " + n);
//         // }
//         // System.out.println("THE AMSTRONG NUMBER BETWEEN 0 TO N:  ");
//         // for(int i=0;i<=n;i++){
//         //     if(angstrom(i) == true){
//         //         System.out.println(i);
//         //     }
//         // }
//         // System.out.println("THE STRING NUMBER BETWEEN THE GIVEN RNGE:");
//         // for(int i=0;i<n;i++){
//         //     if(strongnumber(i)){
//         //         System.out.println(i);
//         //     }
//         // }
        
//     }
// }






