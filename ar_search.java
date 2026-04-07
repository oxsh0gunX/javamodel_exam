import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range;
        int arr[]=new int[100];
        System.out.println("Enter the range here: ");
        range=sc.nextInt();
        for(int i=0;i<range;i++){
            arr[i]=sc.nextInt();
        }
        int element;
        System.out.println("Enter the element to search : ");
        element=sc.nextInt();
        for(int i=0;i<range;i++){
            if ( arr[i] == element){
                System.out.println("the element foudn at "+(i+1));
                break;
            }
            }
        }

    }
