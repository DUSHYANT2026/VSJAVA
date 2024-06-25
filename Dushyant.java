// import java.util.Scanner;
// public class Dushyant {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();

//         System.out.println("ALL THE NUMBER OF GIVEN RANGE:");
//         for(int i=1;i<=n;i++){ 
//             System.out.println(i);
//         }

//         System.out.println();
//         System.out.println("ALL THE EVEN NUMBER OF GIVEN RANGE:");
//         for(int i=1;i<=n;i++){
//             if(i%2 == 0){
//                 System.out.println(i);
//             }
//         }

//         System.out.println();
//         System.out.println("ALL THE  ODD NUMBER OF GIVEN RANGE:");
//         for(int i=1;i<=n;i++){
//             if(i%2 != 0){
//                 System.out.println(i);
//             }
//         }

//         System.out.println();
//         System.out.println("ALL THE ALTERNATE 1 AND -1 WITH IN THE GIVEN RANGE:");
//         for(int i=1;i<=n;i++){
//             if(i%2 != 0){
//                 System.out.println("1");
//             }
//             else{
//                 System.out.println("-1");
//             }
//         }
        
//     }
// }







// class Student{
//     int id;
//     String name;
//   }
//    class Dushyant {
//     public static void main(String[] args) {
  
//         Student s1 = new Student();
//         s1.id = 101;
//         s1.name = "SONOO";
  
//         System.out.println(s1.id + "" + s1.name);
        
//     }
//   }


// class Student{
//     int rollno;
//     String name;

//     void insertrecord(int r , String  n){
//         rollno = r;
//         name = n;
//     }
//     void dislpayinformation(){
//         System.out.println(rollno + "  " + name);
//     }
//   }
//    class Dushyant {
//     public static void main(String[] args) {
  
//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.insertrecord(69,"KING OF KINGS");
//         s2.insertrecord(99,"THE UNDERTAKEER");

//         s1.dislpayinformation();
//         s2.dislpayinformation();
        
//     }
//   }




// class employee{
//     int id;
//     String name;
//     float salary;

//     void insert(int i , String  n, float s){
//         id = i;
//         name = n;
//         salary = s;
//     }
//     void display(){
//         System.out.println(id + "  " + name + "  " + salary);
//     }
//   }
//    public class Dushyant {

//     public static void main(String[] args) {
  
//         employee e1 = new employee();
//         employee e2 = new employee();
//         employee e3 = new employee();

//         e1.insert(69,"KING OF KINGS",47594);
//         e2.insert(55,"THE UNDERTAKEER",487594);
//         e3.insert(100,"THE UNDERTAKEER",438375459);

//         e1.display();
//         e2.display();
//         e3.display();
        
//     }
//   }




// class songs{
//     int order;
//     String views;
//     String songname;

//     songs(){
//         order = 1;
//         views = "10 Millons";
//         songname = "Finn Balor Theme song";
//     }
//     songs(int n, String n1, String n2){
//         order = n;
//         views = n1;
//         songname = n2;
//     }
//   }
//    class Dushyant {
//     public static void main(String[] args) {
  
//         songs s1 = new songs();
//         System.out.println(s1.order+"   " + s1.views +"   "+s1.songname);
//         System.out.println();

//         songs s2 = new songs(5,"1 BILLIONS","THE ROCK THEME SONG");
//         System.out.println(s2.order+"   " + s2.views +"   "+s2.songname);
//     }
//   }




// import java.util.Scanner;
// class Dushyant {
//     public static void main(String[] args) {
//         Scanner it = new Scanner(System.in);
//         int num = it.nextInt();

//         System.out.println("THE MAXIMUM NUMBER IS :   "+ Math.max(99,9));

//         if(num %2 == 0){
//             System.out.println("THE NUMBER IS EVEN: " +num);
//         }else{
//             System.out.println("THE NUMBER IS THE ODD NUMER " + num);
//         }     
//     }
//   }



// import java.util.Scanner;
// class Dushyant {
// static boolean primenumber(int n){
//     for(int i=2;i<n;i++){
//         if(n%i == 0){
//             return false;
//         }
//     }
//     return true;
// }
//     public static void main(String[] args) {
//         Scanner it = new Scanner(System.in);

//         int n = it.nextInt();
//         for(int i=2;i<=n;i++){
//             if(primenumber(i)){
//                 System.out.println(i);
//             }
//         }
//     }
//   }





// class student4{
//     int id;
//     String name;

//     student4(int i,String n){
//         id = i;
//         name = n;
//     }
//     void display(){
//         System.out.println(id +"  " + name);
//     }
//   }
//    class Dushyant {
//     public static void main(String[] args) {
  
//         student4 s1 = new student4(111,"king of kings");
//         s1.display();
//         System.out.println();
//         student4 s2 = new student4(222," ALL ABOUT OLMPIYA");
//         s2.display();
//     }
//   }


// class Dushyant {
//  public static void main(String[] args) {

//      Box b1 = new Box(10,20,15);
//      Box b2 = new Box(3,6,9);

//      double vol;
//      vol = b1.volume();
//      System.out.println("volume is  " + vol);
//      vol = b2.volume();
//      System.out.println("volume is  " + vol);
//  }
// }
// class Box{
//     double depth;
//     double height;
//     double width;

//     Box(double d,double h, double w){
//         depth = d;
//         height = h;
//         width = w;
//     }

//     double volume(){
//         return (depth*height*width);
//     }
//   }



// class Dushyant {
//     public static void main(String[] args) {
   
//         Employee e1 = new Employee(100,"UNDERTAKEER",1500000);
//         Employee e2 = new Employee(101,"BROCK LASNAR",9000000);

//         e1.display();
//         System.out.println();
//         e2.display();
//     }
//    }
//    class Employee{
//        int emp_id;
//        String emp_name; 
//        float salary;
   
//        Employee(int id,String name, float s){
//            emp_id = id;
//            emp_name = name;
//            salary = s;
//        }
   
//        void display(){
//            float da = salary*15/100;
//            float hra = salary*10/100;
//            System.out.println("Employee id  " + emp_id);
//            System.out.println("Employee name  " + emp_name);
//            System.out.println("Employee salary  " + (da + hra));
//        }
//      }



// import java.util.Scanner;
// public class Dushyant {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int id1 = scanner.nextInt();
//         scanner.nextLine(); 
//         String name1 = scanner.nextLine();
//         float salary1 = scanner.nextFloat();
    
//         int id2 = scanner.nextInt();
//         scanner.nextLine(); 
//         String name2 = scanner.nextLine();
//         float salary2 = scanner.nextFloat();
        
//         Employee e1 = new Employee(id1, name1, salary1);
//         Employee e2 = new Employee(id2, name2, salary2);

//         e1.display();
//         System.out.println();
//         e2.display();
        
//         scanner.close(); 
//     }
// }

// class Employee{
//     int emp_id;
//     String emp_name; 
//     float salary;

//     Employee(int id, String name, float s){
//         emp_id = id;
//         emp_name = name;
//         salary = s;
//     }

//     void display(){
//         float da = salary*15/100;
//         float hra = salary*10/100;
//         System.out.println("Employee id: " + emp_id);
//         System.out.println("Employee name: " + emp_name);
//         System.out.println("Employee salary: " + (da + hra));
//     }
// }








// DUE TO THE USE OF FINAL KEYWORD WE CAN'T OVERRIDING THE VARIABLE 
//  OVERRIDING(USING THE SAME NAME TO NEW VARIABLE AND FUNCTION)

// class Bike9{
//     final int speedlimit=90;
//     void run(){
//     speedlimit=400;
//     }
    
//     public static void main(String args[]){
//     Bike9 obj=new Bike9();
//     obj.run();
//     }
// }





// DUE TO THE USE OF FINAL KEYWORD WE CAN'T OVERRIDING THE METHODS

// class Bike{
//     final void run(){System.out.println("running");}   
//     }
//     class Honda extends Bike{    
//     void run(){System.out.println("running safely with 100kmph");}
//     public static void main(String args[]){
//     Honda honda= new Honda();  
//     honda.run();   
//     }      
// }


//THIS IS THE RECURION PROBLEM METHOD CALL ITSELF UNTIL THE CONDITION FAILS 
// THIS QUESTION HAS NO CONTION SO IT CALL ITSELF INFINIT TIME
// public class Dushyant {
//     static void p(){
//     System.out.println("hello");
    
//     p();
    
//     }
//     public static void main(String[] args) {
    
//     p();
//     }
// }


// public class Dushyant {

//     static int count=0;
//     static void p(){
//     count++;
//     if(count<=99){
//     System.out.println("KING OF KINGS: "+ count);
//     p();
    
//     }
// }
//     public static void main(String[] args) {
//     p();
//     }
// }


// import java.util.Scanner;
// public class Dushyant {
//     static int factorial(int n){
//         if(n <= 1) return n;
//         else{
//             return n*factorial(n-1);
//         }    
//     }
    
//     public static void main(String[] args) {
//         Scanner it = new Scanner(System.in);
//         int n = it.nextInt();

//         System.out.println("Factorial of given number is:  "+factorial(n));
    
//     }
// }




// public class Dushyant {
//     static int n1=0,n2=1,n3=0;
//     static void printFibo(int count){
//     if(count>0){
//     n3 = n1 + n2;
//     n1 = n2;
//     n2 = n3;
    
//     System.out.print(" "+n3);
//     printFibo(count-1);
//     }
// }
//     public static void main(String[] args) {
//         int count=15;
//         System.out.print(n1+" "+n2);
//         printFibo(count-2);
//     }
// }





// import java.util.Scanner;
// public class Dushyant {
//     static int series(int n){
//         if(n <= 1) return n;  if(n == 2) return 1;
//         else{
//             return series(n-1) + series(n-2);
//         }    
//     }
    
//     public static void main(String[] args) {
//         Scanner it = new Scanner(System.in);
//         int n = it.nextInt();

//         for(int i=0;i<=n;i++){
//             System.out.print(series(i) + " ");
//         }
    
//     }
// }






// class Access {
//     public static void main(String args[]) {
//     B subOb = new B();
//     subOb.setij(10, 12);
//     subOb.sum();
//     System.out.println("Total is " + subOb.total);
//     }
// }
// class A {
// int i; 
// int j; 
// void setij(int x, int y) {
// i = x;
// j = y;} 
// }
// class B extends A {
// int total;
// void sum() {
// total = i + j; }
// }





// EXAPMLE OF SINGLE INHERTANCE IN WHICH (ONE PARENT CLASS AND OTHER CHILE CLASS), WE CAN MAKE THE OBNJECT OF CHILE CLASS TO USE THE METHODS OF PARENT CALSS
// class Dushyant{ 
//     public static void main(String args[]){ 
//     Dog d=new Dog(); 
//     d.bark(); 
//     d.eat(); 
//     }
// } 
// class Animal{ 
//     void eat()
//     {System.out.println("eating... THE PEDIGREEN THAT GIVEN BY THE HHH KNOWN AS THE KING OF KINGS, THE GAME");} 
// } 
// class Dog extends Animal{ 
//     void bark()
//     {System.out.println("barking...LIKE THE  DOG AND I WILL BEAAT YOU UNTIL YOUR MOTHER DIDN'T RECOGNISE");} 
// } 
  




// THIS EXAMPLE OF MULTILEVEL INHERTANCE ALL CLASSES CAN BE CALL BY THE LAST CLASS (USING BOJECTS OF LAST CLASS):  
// class Dushyant{ 
//     public static void main(String args[]){ 
//     BabyDog d=new BabyDog(); 
//     d.weep(); 
//     d.bark(); 
//     d.eat(); 
//     }
// } 
// class Animal{ 
//     void eat(){System.out.println("EATING");} 
// } 
// class Dog extends Animal{ 
//     void bark(){System.out.println("BARKING");} 
// } 
// class BabyDog extends Dog{ 
//     void weep(){System.out.println("WEEPING");} 
// } 





// class Dushyant{ 
//     public static void main(String args[]){ 
//     Cat c=new Cat(); 
//     c.meow(); 
//     c.eat(); 
//     //c.bark(); //C.T.Error   //BECAUSE WE USE ANIMAL CLASS AS PARENT OF CAT CLASS , SO THE METHODS OF DOG CAN'T ACCESSABLE
//     }
// } 
// class Animal{ 
//     void eat(){System.out.println("eating...");} 
// } 
// class Dog extends Animal{ 
//     void bark(){System.out.println("barking...");} 
// } 
// class Cat extends Animal{ 
//     void meow(){System.out.println("meowing...");} 
// } 
     



// IN JAVA THERE IS NO CONCEPT OF MULTIPLE INHERITANCE ONLY MULTILEVEL INHERITANCE POSSIBLE 





// class Dushyant{ 
//     public static void main(String args[]){ 
//     Dog d=new Dog(); 
//     }
// } 
// class Animal{ 
//     Animal(){System.out.println("animal is created");} 
// } 
//     class Dog extends Animal{ 
//     Dog(){ 
//     super(); 
//     System.out.println("dog is created"); 
//     } 
// } 



// class Dushyant{
//     public static void main(String args[]){
//         B suboj = new B(1,2,3);
//         suboj.show();
//     }
// }
// class A{
//     int i,j;
//     A(int a,int b){
//         i=a;
//         j=b;
//     }
//     void show(){
//         System.out.println("i and j : " + i + "  " + j);
//     }
// }
// class B extends A{
//     int k;
//     B(int a,int b,int c){
//         super(a,b);
//         k=c;
//     }
//     void show(){
//         System.out.print("k = "+ k);
//     }
// }




// class Dushyant { 
//     public static void main(String args[]){ 
//     SBI s=new SBI(); 
//     ICICI i=new ICICI(); 
//     AXIS a=new AXIS(); 
//     System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); 
//     System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()); 
//     System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()); 
//     } 
// } 
// class Bank{ 
//     int getRateOfInterest(){return 0;} 
// } 
// class SBI extends Bank { 
//     int getRateOfInterest(){return 8;} 
// } 
// class ICICI extends Bank { 
//     int getRateOfInterest(){return 7;} 
// } 
// class AXIS extends Bank { 
//     int getRateOfInterest(){return 9;} 
// } 





// class Dushyant {
//     public static void main(String args[]) {
//         Figure f = new Figure(10, 10); 
//         Rectangle r = new Rectangle(9, 5);
//         Triangle t = new Triangle(10, 8);
//         Figure figref;
//         figref = r;
//         System.out.println("Area is " + figref.area());
//         figref = t;
//         System.out.println("Area is " + figref.area());
//         figref = f;
//         System.out.println("Area is " + figref.area()); 
//     }
// }   
// class Figure {
//     double dim1;
//     double dim2;
//     Figure(double a, double b) {
//         dim1 = a;
//         dim2 = b;
//     }
//     double area() {
//         System.out.println("Area for Figure is undefined.");
//         return 0;
//     }
// }
// class Rectangle extends Figure {
//     Rectangle(double a, double b) {
//         super(a, b);
//     }

//     double area() {
//         System.out.println("Inside Area for Rectangle.");
//         return dim1 * dim2;
//     }
// }
// class Triangle extends Figure {
//     Triangle(double a, double b) {
//         super(a, b);
//     }

//     double area() {
//         System.out.println("Inside Area for Triangle.");
//         return dim1 * dim2 / 2;
//     }
// }



 

// class Dushyant{ 
//     private int data=99; 
//     class Inner{ 
//     void msg(){System.out.println("data is "+data);} 
//     } 
// public static void main(String args[]){ 
//     Dushyant obj=new Dushyant(); 
//     Dushyant.Inner in=obj.new Inner(); 
//     in.msg(); 
//     } 
// } 









// class Dushyant{ 
//     public static void main(String args[]){ 
//     BabyDog d=new BabyDog(); 
//     d.weep(); 
//     d.bark(); 
//     d.eat(); 
//     }
// } 
// class bank{ 
//     String name;
//     int age;
//     String gender;
//     String acctype;
//     double total;

//     bank(String  nam , int n , String gen , String type , double ammount){
//         name = nam;
//         age = n;
//         gender = gen;
//         acctype = type;
//         total = ammount;
//     }
// } 
// class display extends bank{ 
//     void bark(){System.out.println("BARKING");} 
// } 
// class BabyDog extends { 
//     void weep(){System.out.println("WEEPING");} 
// } 











// import java.util.Scanner;
// import java.util.*;
// public class Dushyant {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String name = scanner.nextLine();
//         int age = scanner.nextInt();
//         scanner.nextLine(); 
//         String gender = scanner.nextLine();
//         String acctype = scanner.nextLine();
//         double total = scanner.nextDouble();

//         Account account = new Account(name, age, gender, acctype, total);

//         System.out.println("\nAccount Details:");
//         account.getDetails();

//         double withdrawAmount = scanner.nextDouble();
//         account.withdraw(withdrawAmount);

//         System.out.print("\nEnter interest rate: ");
//         double interestRate = scanner.nextDouble();
//         account.calculateInterest(interestRate);

//         scanner.close();
//     }
// }
// class Bank {
//     String name;
//     int age;
//     String gender;

//     Bank(String newname, int newage, String newgender) {
//         name = newname;
//         age = newage;
//         gender = newgender;
//     }

//     void getDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Gender: " + gender);
//     }
// }

// class Account extends Bank {
//     String acctype;
//     double total;

//     Account(String name, int age, String gender, String newacctype, double newtotal) {
//         super(name, age, gender);
//         acctype = newacctype;
//         total = newtotal;
//     }

//     void getDetails() {
//         super.getDetails();
//         System.out.println("Account Type: " + acctype);
//         System.out.println("Total Balance: " + total);
//     }

//     void withdraw(double amount) {
//         if (amount > total) {
//             System.out.println("Insufficient balance");
//         } else {
//             total -= amount;
//             System.out.println(amount + " withdrawn successfully");
//         }
//     }

//     void calculateInterest(double rate) {
//         double interest = total * rate / 100;
//         total += interest;
//         System.out.println("Interest added: " + interest);
//         System.out.println("Total Balance after interest: " + total);
//     }
// }
