class Area{
    void area(int side){
        double result= side * side;
        System.out.println("The area of the squrae is " + result);
    }
    void area(int l ,int b ){
        int result =l*b;
        System.out.println("The area of the rectagler is "+ result);
    }
    void area(double r){
      double  result= 3.14 * r * r;
        System.out.println("The are of the circle is "+ result);

    }
}
class Main{
    public static void main(String args[]){
        Area a1=new Area();
        a1.area(3);
        a1.area(3,4);
        a1.area(3.3);
    }
