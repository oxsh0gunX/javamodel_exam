import java.util.Scanner;
interface shape {
    void area();
    void perimeter();
}
class Rectagural implements shape{
    int l;
    int b;
    public void get_data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ad bridth : ");
        l=sc.nextInt();
        b=sc.nextInt();
 }
 public void area(){
    System.out.println("The area is :"+ (l*b));
 }
 public void perimeter(){
    System.out.println("The perimter is : "+ (2 *(l*b)));
 }
}

class Circle implements shape{
    double r;
  public  void get_data(){
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        r=sc.nextDouble();
    }
   public void area(){
        System.out.println("The are of the circle is : " + (3.14 * r*r ));
    }
  public  void perimeter(){
        System.out.println("The perminter is " +(2 *(3.14 * r* r)));
    }
}


class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Rectagural r1 = new Rectagural();
        Circle c1 = new Circle();
        int choice ;
        System.out.println("1 Rectangular");
        System.out.println("2 Circle ");
      choice=sc.nextInt();
      if ( choice == 1){
        r1.get_data();
        r1.area();
        r1.perimeter();
      }
      if (choice == 2){
        c1.get_data();
        c1.area();
        c1.perimeter();
      }
    
    }
