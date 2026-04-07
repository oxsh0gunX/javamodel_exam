class Prodcut{
    
    int pcode;
    String pname;
    int price;
    public Prodcut(int pc,String pn,int pr){
        pcode=pc;
        pname=pn;
        price=pr;
    }
}
    class Main{
        public static void main(String args[]){
        Prodcut p1=new Prodcut(1,"xs",21);
        Prodcut p2=new Prodcut(2,"md",45);
        Prodcut p3=new Prodcut(2,"rx",54);
        Prodcut min=p1;

        if ( p2.price<min.price){
            min=p2;

        }if( p3.price<min.price ){
            min=p3;
    
        }
        
       System.out.println("the smallest is " +min.pname);

    }
}
