// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;
    
// class codes_java{
// //     int id=5;
// //     String name="faizan";
    
//     public static void main(String[] args){
//print statement
        // System.out.println("print statement");
        // System.out.println("Hello World");

// defining variables with assigning value
        // int x=10;
        // int y=10;

// // unary operators
//         System.out.println("unary operators");
//         System.out.println(x++);
//         System.out.println(++x);
//         System.out.println(x--);
//         System.out.println(--x);

// // unary operator addition
//         System.out.println("unary operator addition");
//         System.out.println(x++ + ++x);
//         System.out.println(x++ + x++);

// // arethematic operators
//         System.out.println("arethematic operators");
//         System.out.println(x+y);
//         System.out.println(x-y);
//         System.out.println(x*y);
//         System.out.println(x/y);

// // left shift operator
//         System.out.println("left shift operator");
//         System.out.println(10<<2); 
//         System.out.println(10<<3);  
//         System.out.println(20<<2); 
//         System.out.println(15<<4);

// // right shift operator
//         System.out.println("right shift operator");
//         System.out.println(10>>2);
//         System.out.println(20>>2);  
//         System.out.println(20>>3);

// // for statement for printing number till 10
//         System.out.println("for statement for printing number till 10");
//         for(int i=1;i<=10;i++){  
//             System.out.println(i);  
//         }
//     }
// }
// // to take input from user and tell even or odd
//         // System.out.println("to take input from user and tell even or odd");
//         @SuppressWarnings("resource")
//         Scanner obj = new Scanner(System.in);
//         int num = obj.nextInt();
//         System.out.println("Enter Number:");

//         if(num%2==0){
//             System.out.println(num + "  is even");
//         }
//         else{
//             System.out.println(num + "  is odd");
//         }

// // //printing series 1,-1,1,-1,1,-1,1,-1.......
//             System.out.println("printing series 1,-1,1,-1,1,-1,1,-1.......");
//             for(int i=0;i<10;i++){
//                 if(i%2==0){
//                     System.out.println(" 1 ");
//                 }
//                 else{
//                     System.out.println(" -1 ");
//                 }

//             }
            
            // codes_java s1 = new codes_java();
            
            // System.out.println(s1.id);
            // System.out.println(s1.name);

        //     codes_java s1 = new codes_java();
        //     s1.id=6;
        //     s1.name="faizan khan";
        //     System.out.println(s1.id+" "+s1.name);
//     }
// class student{
//     int rollno;  
//     String nam;  
//         void insertRecord(int r, String n){  
//                 rollno=r;  
//                 nam=n;  
//         }  
//         void displayInformation(){System.out.println(rollno+" "+nam);}  
//         }  
//         class codes_java{  
//         public static void main(String args[]){  
//                 student s1=new student();  
//                 student s2=new student();  
//                 s1.insertRecord(111,"Karan");  
//                 s2.insertRecord(222,"Aryan");  
//                 s1.displayInformation();  
//                 s2.displayInformation();  
//         }  
// }

// class Employee{  
//         int id;  
//         String name;  
//         float salary;  
//         void insert(int i, String n, float s) {  
//             id=i;  
//             name=n;  
//             salary=s;  
//         }  
//         void display(){System.out.println(id+" "+name+" "+salary);}  
//     }  
//     public class codes_java {  
//     public static void main(String[] args) {  
//         Employee e1=new Employee();  
//         Employee e2=new Employee();  
//         Employee e3=new Employee();  
//         e1.insert(101,"ajeet",45000);  
//         e2.insert(102,"irfan",25000);  
//         e3.insert(103,"nakul",55000);  
//         e1.display();  
//         e2.display();  
//         e3.display();  
//     }  
//     }
        // int temp=0;
        // for (int i=1; i<=30; i++) {
        //     for (int j=1; j<30; j++) {
        //         if (i%j==0) {
        //             temp++;
        //         }
        //     }
        //     if (temp ==2) {
        //         System.out.println(i);
        //     }
        //     temp=0;
        // }
//         System.out.println("constructor");
        
//     }
// }

// class codes_java{
//     double width;
//     double height;
//     double depth;
//     // codes_java(int w,doubleh,doubled){
//     //     width=w;
//     //     height=h;
//     //     depth=d;
//     // }
//     double volume(){
//         return width*height*depth;}}
//         class BoxDemo7{
//             public static void main(String[] args) {
//                 codes_java mybox1= new codes_java(10,20,15);
//                 codes_java mybox2= new codes_java(3,6,9);
//                 double vol;
//                 vol= mybox1.volume();
//                 System.out.println("volume is" + vol);
//                 vol= mybox2.volume();
//                 System.out.println("volume is" + vol);
//             }
//         }

// // // to get gross salary
// class employee{
//     int emp_id;
//     String emp_name;
//     float basic_salary;

//     employee(int id, String name, float sal)
//     {
//         emp_id=id;
//         emp_name=name;
//         basic_salary=sal;
//     }
   
    
//     void display()
//     {
//         float da=basic_salary*15/100;
//         float hra=basic_salary*10/100;
//         float gross_sal=basic_salary+da+hra;
//         System.out.println("Employee Id = "+emp_id);
//         System.out.println("Employee Nmae = "+emp_name);
//         System.out.println("Gross Salary = "+gross_sal);
//     }
// }

// class codes_java{
//     public static void main(String[] args) throws NumberFormatException, IOException {
//         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("enter employee id: ");
//         int id = Integer.parseInt(br.readLine());
//         System.out.println("enter employee name: ");
//         String name = br.readLine();
//         System.out.println("enter basic salary: ");
//         Float sal = Float.parseFloat(br.readLine());
//         employee e = new employee(id, name, sal);
//         e.display();

//     }
// }

// class student
// {
//     int rollno;
//     String name;
//     float fee;
//     student(int rollno, String name, float fee){
//         this.rollno = rollno;
//         this.name = name;
//         this.fee = fee;

//     }
//     void display(){System.out.println(rollno+" "+name+" " +fee);}
// }

// class codes_java{
//     public static void main(String[] args) {
//         student s1= new student(111,"ankit",5000f);
//         student s2= new student(112,"ankur",7000f);
//         s1.display();
//         s2.display();

//     }
// }

// //final keyword
// class bike{
//     final void run(){System.out.println("running");}
// }

// class codes_java extends bike{
//     void run(){System.err.println(" running safely with 100kmph");}

//     public static void main(String[] args) {
//         codes_java honda = new codes_java();
//         honda.run();
//     }

// }

// public class codes_java{

//     static int count=0;
//     static void p(){
        
//         count++;
//         if(count<=5){
//             System.out.println("hello" +count);
//             p();
//         }
//     }

//     public static void main(String[] args) {
//         p();
//     }
// }

// public class codes_java{
//     static int fact(int n){
//         if (n==1)
//         return 1;
//         else 
//         return(n*fact(n-1));
//     }

//     public static void main(String[] args){
//         System.out.println("Factorial of 5 is : " +fact(5));
//     }
// }

// public class codes_java {
//     static int n1 = 0, n2 = 1, n3 = 0;

//     static void printFibo(int count) {
//         if (count > 0) {
//             n3 = n1 + n2;
//             n1 = n2;
//             n2 = n3;
//             System.out.print(" " + n3);
//             printFibo(count - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int count = 15;
//         System.out.print(n1 + " " + n2);
//         // printing 0 and 1
//         printFibo(count - 2);
//         // n-2 because 2 numbers are already printed
//     }
// }

// // single level inheritance

// class animal{
//     void eat()
//     {System.out.println("eating...");}
// }
// class dog extends animal{
//     void bark()
//     {System.out.println("\nbarking...");}
//     void sleep()
//     {System.out.println("sleeping...");}
// }
// class codes_java{
//     public static void main(String[] args) {
//         System.out.println("\n-------multi level inheritance");
//         dog d = new dog();
//         d.bark();
//         d.eat();
//         d.sleep();

//     }
// }

// // multi level inhertance

// class Animal{
//     void eat(){System.out.println("eating...");}
//     }
//     class Dog extends Animal{
//     void bark(){System.out.println("barking...");}
//     }
//     class BabyDog extends Dog{
//     void weep(){System.out.println("\nweeping...");}
//     }
    
//     class codes_java{
//     public static void main(String args[]){
//         System.out.println("\n-------multi level inheritance");
//         BabyDog d=new BabyDog();
//         d.weep();
//         d.bark();
//         d.eat();
//     }
// }

// // hierarchical 

// class Animal{
//         void eat()
//         {System.out.println("eating...");}
//     }
//     class Dog extends Animal{
//     void bark()
//     {System.out.println("barking...");}
//     }
//     class cat extends Animal{
//     void sleep()
//     {System.out.println("\nsleeping...");}
//     }
// class codes_java{
//     public static void main(String args[]){
//     System.out.println("\n-------hierarchical inheritance");
//     cat d=new cat();
//     d.sleep();
//     // d.bark(); ////it'll throw error as it is not inherited
//     d.eat();
//     }
// }


// class employee{
//     void work()
//     {System.out.println("working....");}
// }

// class staff extends employee{
//     void staff1()
//     {System.out.println("working employee is staff...");}
// }

// class boss extends employee{
//     void boss1()
//     {System.out.println("\nboss is working....");}
// }

// class codes_java{
//     public static void main(String[] args) {
//         System.out.println("\n-------hierarchical inheritance");
//         boss b=new boss();
//         b.boss1();
//         b.work(); 
//     }
// }

// // super keyword in java 
// class Animal{
//     String color="white\n";
// }
//     class Dog extends Animal{
//     String color="\nblack";
//     void printColor(){
//     System.out.println(color);           //prints color of Dog class
//     System.out.println(super.color);    //prints color of Animal class
//     }
// }
    
//     class codes_java{
//     public static void main(String args[]){
//     Dog d=new Dog();
//     d.printColor();
//     }
// }


// // method overriding 
class A {
    int i, j;
    A(int a, int b) {
    i = a;
    j = b;
    }
    
    // display i and j
    
    void show() {
    System.out.println("i and j: " + i + " " + j);
    }
    }
    
    class B extends A {
    int k;
    B(int a, int b, int c) {
    super(a, b);
    k = c;
    }
    
    // display k – this overrides show() in A
    
    void show() {
    System.out.println("k: " + k);
    }
    }

    class codes_java {
        public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // this calls show() in B
        }
    }














// //method overloading 

// class A{
//     int i,j;
//     A(int a, int b){
//         i = a;
//         j = b;
//     }
        
//         void show() {
//         System.out.println("i and j: " + i + " " + j);
//         }
//     }
//         // Create a subclass by extending class A.
//         class B extends A {
//         int k;
//         B(int a, int b, int c) {
//         super(a, b);
//         k = c;
//         }
//         // overload show()
        
//         void show(String msg) {
//         System.out.println(msg + k);
//         }
//     }

//     class codes_java {
//         public static void main(String args[]) {
//         B subOb = new B(1, 2, 3);
//         subOb.show("This is k: ");
//         // this calls show() in B
//         subOb.show(); // this calls show() in A
//         }
//     }

// java program to demonstrate the real scenario of java method overriding
// Creating a parent class.

// class Bank{

//     int getRateOfInterest(){return 0;}
//     }
    
//     //Creating child classes.
    
//     class SBI extends Bank
//     { int getRateOfInterest(){return 8;} }
//     class ICICI extends Bank
//     { int getRateOfInterest(){return 7;} }
//     class AXIS extends Bank
//     { int getRateOfInterest(){return 9;} }
    
//     //Test class to create objects and call the methods
//     class codes_java
//     {
//     public static void main(String args[]){
//     SBI s=new SBI();
//     ICICI i=new ICICI();
//     AXIS a=new AXIS();
//     System.out.println("\nSBI Rate of Interest: "+s.getRateOfInterest());
//     System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
//     System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
//     } 
// }
    

// class figure{
//     double dim1;
//     double dim2;
//     figure(double a, double b){
//         dim1 =a;
//         dim2 =b;
//     }

//     double area(){
//         System.out.println("area of figure is undefined ");
//         return 0;
//     }
// }

// class rectangle extends figure{
//     rectangle(double a, double b){
//         super(a,b);
//     }

// double area(){
//     System.out.println(" inside area for rectangle. ");
//     return dim1*dim2;
// }
// }

// class triangle extends figure{
//     triangle(double a, double b){
//         super(a,b);
//     }

//     // override area for right triangle
//     double area() {
//     System.out.println 
//     ("Inside Area for Triangle.");
//     return dim1 * dim2 / 2;
//     }
// }

//     class codes_java {
//          public static void main(String args[]) {
//         figure f = new figure(10, 10); //super class object
//         rectangle r = new rectangle(9, 5);
//         triangle t = new triangle(10, 8);
//         figure figref;
//         figref = r;
//         System.out.println("\nArea is " + figref.area());
//         figref = t;
//         System.out.println("Area is " + figref.area());
//         figref = f;
//         System.out.println("Area is " + figref.area());
//     }
// } 


// //  inner class 
// class codes_java{
//         private int data=30;
//         class Inner{
//         void msg(){System.out.println("data is "+data);}
//         }
//                 public static void main(String args[]){
//                         TestMemberOuter1 obj=new TestMemberOuter1();
//                         TestMemberOuter1.Inner in=obj.new Inner();
//                         in.msg();
//         }
// }

// // java anonymous inner class example using class
// abstract class person{
//         abstract void eat();
// }
// class codes_java{
//         public static void main(String[] args) {
//                     person p = new person(){
//                         void eat(){System.out.println(" nice fruits ");}
//                 };
//                 p.eat();
//         }
// }


// //java anonymous inner class example using interface
// interface Eatable {
//         void eat();
// }

// class TestAnnonymousInner1 {
//         public static void main(String args[]) {
//                 Eatable e = new Eatable() {
//                         public void eat() {
//                                 System.out.println("nice fruits");
//                         }
//                 };
//                 e.eat();
//         }
// }

// //Java local inner class example
// public class codes_java {
//         private int data = 30;// instance variable

//         void display() {
//                 class Local {
//                         void msg() {
//                                 System.out.println(data);
//                         }
//                 }
//                 Local l = new Local();
//                 l.msg();
//         }

//         public static void main(String args[]) {
//                 codes_java obj = new codes_java();
//                 obj.display();
//         }
// }


// class Animal{
//             void eat(){System.out.println("eating...");}
//             }
//             class Dog extends Animal{
//             void bark(){System.out.println("barking...");}
//             }
//             class BabyDog extends Dog{
//             void weep(){System.out.println("\nweeping...");}
//             }
            
//             class codes_java{
//             public static void main(String args[]){
//                 System.out.println("\n-------multi level inheritance");
//                 BabyDog d=new BabyDog();
//                 d.weep();
//                 d.bark();
//                 d.eat();
//             }
//         }

// //bank account 
// import java.util.Scanner;

// class Bank {
//     int accNo;
//     String name;
//     int age;
//     char gender;
//     String accType;
//     double total;

//     Scanner scanner = new Scanner(System.in);

//     void getDetails() {
//         System.out.println("Enter Account Number:");
//         accNo = scanner.nextInt();
//         scanner.nextLine(); // Consume newline
//         System.out.println("Enter Name:");
//         name = scanner.nextLine();
//         System.out.println("Enter Age:");
//         age = scanner.nextInt();
//         System.out.println("Enter Gender (M/F):");
//         gender = scanner.next().charAt(0);
//         System.out.println("Enter Account Type:");
//         accType = scanner.next();
//         System.out.println("Enter Initial Balance:");
//         total = scanner.nextDouble();
//     }

//     void displayBalance() {
//         System.out.println("Balance: $" + total);
//     }

//     void withdraw(double amount) {
//         if (amount > total) {
//             System.out.println("Insufficient balance.");
//         } else {
//             total -= amount;
//             System.out.println("$" + amount + " withdrawn successfully.");
//         }
//     }

//     void deposit(double amount) {
//         total += amount;
//         System.out.println("$" + amount + " deposited successfully.");
//     }
// }

// class Interest extends Bank {
//     double rate = 0.05; // 5% annual interest rate

//     double calculateInterest() {
//         return total * rate;
//     }
// }

// public class codes_java {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         Interest account = new Interest();

//         System.out.println("Enter Account Details:");
//         account.getDetails();

//         while (true) {
//             System.out.println("\nChoose an Option:");
//             System.out.println("1. Display Balance");
//             System.out.println("2. Withdraw");
//             System.out.println("3. Deposit");
//             System.out.println("4. Calculate Annual Interest");
//             System.out.println("5. Exit");

//             int choice = s.nextInt();

//             switch (choice) {
//                 case 1:
//                     account.displayBalance();
//                     break;
//                 case 2:
//                     System.out.println("Enter amount to withdraw:");
//                     double withdrawAmount = s.nextDouble();
//                     account.withdraw(withdrawAmount);
//                     break;
//                 case 3:
//                     System.out.println("Enter amount to deposit:");
//                     double depositAmount = s.nextDouble();
//                     account.deposit(depositAmount);
//                     break;
//                 case 4:
//                     double interest = account.calculateInterest();
//                     System.out.println("Annual Interest: $" + interest);
//                     break;
//                 case 5:
//                     System.out.println("Exiting...");
//                     System.exit(0);
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please enter a valid option.");
//             }
//         }
//     }
// }

// class figure{
//     double dim1;
//     double dim2;
//     figure(double a, double b){
//         dim1 =a;
//         dim2 =b;
//     }

//     double area(){
//         System.out.println("area of figure is undefined ");
//         return 0;
//     }
// }

// class rectangle extends figure{
//     rectangle(double a, double b){
//         super(a,b);
//     }

// double area(){
//     System.out.println(" inside area for rectangle. ");
//     return dim1*dim2;
// }
// }

// class triangle extends figure{
//     triangle(double a, double b){
//         super(a,b);
//     }

//     // override area for right triangle
//     double area() {
//     System.out.println 
//     ("Inside Area for Triangle.");
//     return dim1 * dim2 / 2;
//     }
// }

//     class codes_java {
//          public static void main(String args[]) {
//         figure f = new figure(10, 10); //super class object
//         rectangle r = new rectangle(9, 5);
//         triangle t = new triangle(10, 8);
//         figure figref;
//         figref = r;
//         System.out.println("\nArea is " + figref.area());
//         figref = t;
//         System.out.println("Area is " + figref.area());
//         figref = f;
//         System.out.println("Area is " + figref.area());
//     }
// } 

// // threading 
// class mythread extends Thread{
//         public void run()
//         {
//                 for(int i=0; i<10; i++){
//                         System.out.println("thread");
//                 }
//         }
// }

// class codes_java{
//         public static void main(String[] args) {
//                 mythread t = new mythread();
//                         t.start();
//                         for(int i=0; i<10; i++){
//                                 System.out.println("main thread");
//                 }
//         }
// }



// // exception handling
        
// public class codes_java{
//         public static void main(String[] args) {
//                 int num = 10;
//                 int den = 0;
//                 try{
//                         int result = num/den;
//                         System.out.println("Result of Division : "+result);
//                 }catch(ArithmeticException e){
//                         System.out.println("Divide by zero exception : " + e.getMessage());
//                 }
//         }

//         @Override
//         public String toString() {
//                 return "codes_java []";
//         }
// }

// package cseB;
// class x extends Thread{
//         public void run(){
//                 for(int i=0; i<=5; i++){
//                         if(i==2)yield();
//                                 System.out.println("print the first thread x"+i);
//                 }System.out.println("print the first thread completed");
//         }
// }
// class y extends Thread{
//         @SuppressWarnings("removal")
//         public void run(){
//                 for(int i=0; i<=5; i++){
//                         if(i==3)stop();
//                         System.out.println("print the second thread");
//                 }System.out.println("print the second thread completed");
//         }
// }

// class z extends Thread{
//         public void run(){
//                 for(int i=0; i<=5; i++){
//                         if(i==4){
//                                 System.out.println("system is sleep");
//                                 try{
//                                         sleep(1000);
//                                 }
//                                 catch(Exception e){
//                                         System.out.println("error");
//                                 }
//                                 System.out.println("third thread completed");
//                         }
//                 }
//         }
// }

// public class codes_java{
//         public static void main(String[] args) {
//                 x o1 = new x();
//                 y o2 = new y();
//                 z o3 = new z();
//                 System.out.println("thread 1 is start");
//                 o1.start();
//                 System.out.println("thread 2 is start");
//                 o2.start();
//                 System.out.println("thread 3 is start");
//                 o3.start();
//                 System.out.println(" thread all completed");

//         }

// }
