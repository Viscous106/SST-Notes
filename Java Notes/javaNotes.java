//This is used for a single line comment
/*multiline comment
to comment multiline*/

//basic print commands

/*
 public class javaNotes{
       public static void main (String[] args){
               System.out.println("Hello World");
//if ln is wriitien after print it makes the next statement in new line
               System.out.println("Welcome to programming");
	       System.out.println(5+9);
//if written in "" then its string but if not it became operation or int or float or something depends on the value     
              //System.out.println("hi"*"guys");   //error as string cant be mult
	      System.out.println("hello"+3);//catenation
              System.out.println(3*4+"Hello"+"World");//mult and catenation
              
	}
}

//another way

*/
/*import java.util.*;  //scanner or class
class HelloWorld{
        public static void main (String[] args){
               System.out.println("Hello World");
//if ln is wriitien after print it makes the next statement in new line
               System.out.println("Welcome to programming");
	       System.out.println(5+9);
//if written in "" then its string but if not it became operation or int or float or something depends on the value     
              //System.out.println("hi"*"guys");   //error as string cant be mult
	      System.out.println("hello"+3);//catenation
              System.out.println(3*4+"Hello"+"World");//mult and catenation
              
	}
}*/

//Variables:

/*public class javaNotes{
        public static void main(String[] args) {
            int a = 20;
            System.err.println(a);
        }
} */


/*
types of non decimals datatypes
byte for 8 bits
short for 16 bits
int 32 bits
long 64 bits
*/
/*
public class javaNotes{
        public static void main(String[] args){
                long a =100000;
                int b =400000;
                long result =a*b;
                System.out.print(result);
        }
}
 */

 
 import java.util.*;
 
 class javaNotes {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number:");
                int input1=sc.nextInt();
                System.out.print("you have entered "+input1);
        }
        
 }                                                                                                                                                                