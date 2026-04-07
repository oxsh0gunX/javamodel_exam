import java.util.*;
class Main{
    public static void main(String args[]){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string here: ");
     String str=sc.next();
     System.out.println("the upper case of the String is =" + str.toUpperCase());
     System.out.println("The lower case of the string is =" + str.toLowerCase());
     System.out.println("The length of the String is =" + str.length());
     System.out.println("The Concat of the string is "+  str.concat("umbiko "));
     String trimed_str=str.trim();
     System.out.println("The trimed string is : " + trimed_str);
     String str_replace = str.replace('w','f');
     System.out.println("the replced string is : "+ str_replace);


    }
