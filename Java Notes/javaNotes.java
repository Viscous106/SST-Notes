/*
import java.util.*;
import java.util.Arrays;
class javaNotes {
        public static void main(String[] args) {

        ///////////How to print variables:
                int a = 10;
                System.out.println(a);
                String name = "John";
                System.out.println(name);
                System.out.printf("The value of a is %d and name is %s\n", a, name);//formatted print
                System.out.format("The value of a is %d and name is %s\n", a, name);//formatted print

        /////////types of non decimals datatypes

                byte for 1byte [-128 to 127]
                short for 2bytes [-32,768 to 32,767]
                int 4bytes [-2,147,483,648 to 2,147,483,647]
                long 8bytes [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
        
        /////////types of decimal datatypes:
                float 4bytes [1.4E-45 to 3.4028235E38]
                double 8bytes [4.9E-324 to 1.7976931348623157E308]
        /////////boolean and strings datatypes:
                char 2bytes ['a' to 'z' or 'A' to 'Z' or any symbol]
                boolean 1byte [true or false]
                String [collection of characters]
        
        //////////cassting:
                public static void main(String[] args){
                long a =100000L;//L here tells the system that the num is a long
                int b =400000;
                long result =a*b;
                System.out.print(result);


        //////////input int:
                Scanner in = new Scanner(System.in);
                System.out.println("Enter a number:");
                //how to take integer output
                int input1=in.nextInt();
                System.out.print("you have entered "+input1);

        //////////input string:
                Scanner in = new Scanner(System.in);
                System.out.println("Enter a text:");
                //how to take string output
                String input1=in.nextLine();
                System.out.print("you have entered "+input1);
                System.out.println(input1.length());//length of string
                System.out.println(input1.toLowerCase());//lowercase
                System.out.println(input1.toUpperCase());//uppercase
                System.out.println(input1.trim());//removes spaces before and after the string
                System.out.println(input1.substring(0,4));//substring from 0 to 3


        /////////1D array:
                
                //Meth 1
                // int[] arr = new int[5];//declaration of array of size 5
                // arr[0]=10;
                // arr[1]=60;
                // arr[2]=30;
                // arr[3]=40;
                // arr[4]=50;
                
                
                //Meth 2
                int[] arr = {10, 60, 30, 40, 50};//declaration and initialization of arraay
                System.out.println(arr);//prints the address of the array
                System.out.println(arr[0]);//prints the 0th index value of array
                System.out.println(arr.length);//length of array
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));//prints the sorted array
                
        //////////2d array:
                
                //Meth 1
                int[][] arr = new int[3][3];//declaration of 2D array of size 3x3
                arr[0][0]=10;
                arr[0][1]=20;
                arr[0][2]=30;
                arr[1][0]=40;
                arr[1][1]=50;
                arr[1][2]=60;
                arr[2][0]=70;
                arr[2][1]=80;
                arr[2][2]=90;
                //Meth 2
                // int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};//declaration and initialization of 2D array
                System.out.println(Arrays.deepToString(arr));//prints the 2D array


                //final int a = 10; //constant variable
                // a = 20; //error as constant variable cannot be changed
                

                
        ////////operators 
                int a = 10;
                int b = 20;
                System.out.println(a+b);//addition
                System.out.println(a-b);//subtraction
                System.out.println(a*b);//multiplication
                System.out.println(b/a);//division
                //if one is float and one is int then the output will be float
                //if both are int then the output will be int
                System.out.println(b%a);//modulus
                System.out.println(++a);//pre-increment
                System.out.println(a++);//post-increment
                System.out.println(--b);//pre-decrement
                System.out.println(b--);//post-decrement

                //logical operators: &&(and), ||(or), !(not)
                System.out.println((a<b) && (a==10));//true && true = true
                System.out.println((a>b) || (a==10));//false || true = true
                System.out.println(!(a==10));//not true = false

                //comparison operators: ==, !=, >, <, >=, <=
                System.out.println(a==b);//false
                System.out.println(a!=b);//true
                System.out.println(a>b);//false
                System.out.println(a<b);//true
                System.out.println(a>=b);//false
                System.out.println(a<=b);//true

        


        }
}
*/

/*
import java.util.*;
public class javaNotes {
        public static void main(String[] args) {
                //write code here
        }
}
*/