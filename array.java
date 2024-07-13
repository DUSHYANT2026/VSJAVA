// // import java.util.ArrayList;
// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         ArrayList<String> nums = new ArrayList<>();
//         nums.add("X");
//         nums.add("W");
//         nums.add("E");
//         nums.add("Y");
//         nums.add("Z");
//         nums.add(2,"A");

//         System.out.println("THE SIZE OF THE ARRAY LIST : " +  nums.size());
//         System.out.print("ALL THE ELEMENT IN THE ARRAY LIST:");
//         for(int i=0; i<nums.size(); i++){
//             System.out.println(nums.get(i));
//         }
//     }
// }



// // CONVERT A ARRAYLIST TO AN ACTUAL ARRAY USING  name.toArray();
// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         ArrayList<Integer> nums = new ArrayList<>();

//         for(int i=1; i<=10; i++){
//             nums.add(i);
//         }

//         System.out.println("THE SIZE OF THE ARRAY LIST : " +  nums.size());
//         System.out.println("ALL THE ELEMENT IN THE ARRAY LIST:");
//         for(int i=0; i<nums.size(); i++){
//             System.out.println(nums.get(i));
//         }

//         System.out.println("CONVERT A ARRAYLIST INTO ACTUAL ARRAY: AND PRINT ALL THE ELEMENTS: ");
//         Integer[] newnums = nums.toArray(new Integer[0]);
//         for(int i=0; i<newnums.length; i++){
//             System.out.println(newnums[i]);
//         }
//     }
// }



// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         Vector<String> nums = new Vector<String>();
   
//         nums.add("Ayush"); 
//         nums.add("Amit"); 
//         nums.add("Ashish"); 
//         nums.add("Garima");

//         System.out.println("THE SIZE OF THE VECTOR : " +  nums.size());
//         System.out.println("ALL THE ELEMENT IN THE VECTOR:");
//         for(int i=0; i<nums.size(); i++){
//             System.out.println(nums.get(i));
//         }
//         System.out.println(nums.get(0));
//     }
// }
  


// import java.util.*; 
// public class array{ 
//     public static void main(String args[]){ 
//         Stack<String> stack = new Stack<String>(); 

//         stack.push("Ayush"); 
//         stack.push("Garvit"); 
//         stack.push("Amit"); 
//         stack.push("Ashish"); 
//         stack.push("Garima"); 
//         stack.pop(); 

//         Iterator<String> itr=stack.iterator(); 
//         while(itr.hasNext()){ 
//             System.out.println(itr.next()); 
//         } 
//     } 
// } 



// CODE FOR THE ENCAPSULATION (USING GETTER and setter methods)
// public class array {
//     private String name;
//     private int age;

//     public array(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         if (age > 0) {
//             this.age = age;
//         } else {
//             System.out.println("Age must be positive.");
//         }
//     }
//     public static void main(String[] args) {
//         array array = new array("John Doe", 25);

//         System.out.println("Name: " + array.getName());
//         System.out.println("Age: " + array.getAge());

//         array.setName("Jane Doe");
//         array.setAge(30);

//         System.out.println("Updated Name: " + array.getName());
//         System.out.println("Updated Age: " + array.getAge());
//     }
// }
