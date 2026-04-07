class Complex{
    int real ;
    int image;
    public Complex(int r, int i){
        real= r;
        image=i;
    }
}
class Main{
    public static void main(String args[]){
        Complex c1=new Complex(1,2);
        Complex c2=new Complex(3,4);
        int realsum=c1.real + c2.real;
        int imgesum=c1.image + c2.image;
        System.out.println("sum=" +realsum+ "+" +imgesum+ "i");
    }
