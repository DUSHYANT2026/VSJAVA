
import java.util.*;    
class tempCodeRunnerFile{
//     int id=5;
//     String name="faizan";
    
    public static void main(String[] args){

        System.out.println("print statement");
        System.out.println("Hello World");

        int x=10;
        int y=10;

// unary operators
        System.out.println("unary operators");
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

// unary operator addition
        System.out.println("unary operator addition");
        System.out.println(x++ + ++x);
        System.out.println(x++ + x++);

// arethematic operators
        System.out.println("arethematic operators");
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

// left shift operator
        System.out.println("left shift operator");
        System.out.println(10<<2); 
        System.out.println(10<<3);  
        System.out.println(20<<2); 
        System.out.println(15<<4);

// right shift operator
        System.out.println("right shift operator");
        System.out.println(10>>2);
        System.out.println(20>>2);  
        System.out.println(20>>3);

// for statement for printing number till 10
        System.out.println("for statement for printing number till 10");
        for(int i=1;i<=10;i++){  
            System.out.println(i);  
        }
    }
}
