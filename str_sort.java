import java.util.*;
class Main{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of String you want to enter: ");
        int number=sc.nextInt();
        System.out.println("Enter the strings");
        String arr[]=new String[number];
        for(int i=0;i<number;i++){
            arr[i]=sc.next();

        }
        Arrays.sort(arr);
        System.out.println("The sorted array is : ");
        for(int i =0; i<number;i++){
            System.out.println(arr[i]);
        }
    }
