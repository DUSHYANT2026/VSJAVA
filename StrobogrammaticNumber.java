// import java.util.Scanner;

// public class BankAccount {
//     private double balance;

//     public BankAccount(double initialBalance) {
//         balance = initialBalance;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposit successful!");
//         } else {
//             System.out.println("Invalid deposit amount!");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > balance) {
//             System.out.println("Insufficient balance!");
//         } else if (amount > 0) {
//             balance -= amount;
//             System.out.println("Withdrawal successful!");
//         } else {
//             System.out.println("Invalid withdrawal amount!");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter initial balance: ");
//         double initialBalance = scanner.nextDouble();

//         BankAccount account = new BankAccount(initialBalance);
        
//         int option = 0;
//         do {
//             System.out.println("Select an option: ");
//             System.out.println("1. Deposit");
//             System.out.println("2. Withdraw");
//             System.out.println("3. Exit");

//             option = scanner.nextInt();

//             switch (option) {
//                 case 1:
//                     System.out.print("Enter deposit amount: ");
//                     double depositAmount = scanner.nextDouble();
//                     account.deposit(depositAmount);
//                     System.out.println("Current balance: " + account.getBalance());
//                     break;
//                 case 2:
//                     System.out.print("Enter withdrawal amount: ");
//                     double withdrawalAmount = scanner.nextDouble();
//                     account.withdraw(withdrawalAmount);
//                     System.out.println("Current balance: " + account.getBalance());
//                     break;
//                 case 3:
//                     System.out.println("Thank you for using our service!");
//                     System.out.println("Final balance: " + account.getBalance());
//                     return;
//                 default:
//                     System.out.println("Invalid option! Please try again.");
//             }
//         }while(true);
//     }
// }




// import java.util.Scanner;

// public class ElectricityBill {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter number of units for calculating electricity bill: ");
//         int units = scanner.nextInt();
//         double billAmount = calculateBill(units);

//         System.out.println("The electricity bill for " + units + " units is: $" + billAmount);
//     }

//     public static double calculateBill(int units) {
//         double bill = 0.0;

//         if (units <= 100) {
//             bill = units * 1.20;
//         } else if (units <= 300) {
//             bill = (100 * 1.20) + ((units - 100) * 2.00);
//         } else {
//             bill = (100 * 1.20) + (200 * 2.00) + ((units - 300) * 3.00);
//         }

//         return bill;
//     }
// }







// import java.util.Scanner;
// import java.util.Arrays;

// public class PrimeCalculation {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a limit: ");
//         int limit = scanner.nextInt();

//         boolean[] isPrime = sieveOfEratosthenes(limit);
//         long product = 1;
//         int sum = 0;

//         for (int i = 2; i <= limit; i++) {
//             if (isPrime[i]) {
//                 product *= i;
//                 sum += i;
//             }
//         }

//         long difference = product - sum;

//         System.out.println("Product of all prime numbers up to " + limit + ": " + product);
//         System.out.println("Sum of all prime numbers up to " + limit + ": " + sum);
//         System.out.println("Difference between product and sum: " + difference);
//     }

//     public static boolean[] sieveOfEratosthenes(int limit) {
//         boolean[] isPrime = new boolean[limit + 1];
//         Arrays.fill(isPrime, true);
//         isPrime[0] = isPrime[1] = false;

//         for (int i = 2; i * i <= limit; i++) {
//             if (isPrime[i]) {
//                 for (int j = i * i; j <= limit; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }

//         return isPrime;
//     }
// }






// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class StrobogrammaticNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the lower bound of the range: ");
//         int lower = scanner.nextInt();
//         System.out.print("Enter the upper bound of the range: ");
//         int upper = scanner.nextInt();

//         List<String> result = findStrobogrammaticInRange(lower, upper);

//         System.out.println("Strobogrammatic numbers within the range " + lower + " to " + upper + ":");
//         for (String num : result) {
//             System.out.println(num);
//         }
//     }

//     public static List<String> findStrobogrammaticInRange(int lower, int upper) {
//         List<String> strobogrammaticNumbers = new ArrayList<>();
//         for (int len = String.valueOf(lower).length(); len <= String.valueOf(upper).length(); len++) {
//             strobogrammaticNumbers.addAll(findStrobogrammaticNumbers(len, len));
//         }

//         List<String> result = new ArrayList<>();
//         for (String num : strobogrammaticNumbers) {
//             int value = Integer.parseInt(num);
//             if (value >= lower && value <= upper) {
//                 result.add(num);
//             }
//         }

//         return result;
//     }

//     private static List<String> findStrobogrammaticNumbers(int n, int m) {
//         if (n == 0) {
//             return new ArrayList<>(List.of(""));
//         }
//         if (n == 1) {
//             return new ArrayList<>(List.of("0", "1", "8"));
//         }

//         List<String> list = findStrobogrammaticNumbers(n - 2, m);
//         List<String> res = new ArrayList<>();

//         for (String s : list) {
//             if (n != m) {
//                 res.add("0" + s + "0");
//             }
//             res.add("1" + s + "1");
//             res.add("6" + s + "9");
//             res.add("8" + s + "8");
//             res.add("9" + s + "6");
//         }

//         return res;
//     }
// }
