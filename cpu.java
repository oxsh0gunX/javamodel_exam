// Create CPU with attribute price.
//  Create inner class Processor (no. of cores, manufacturer)
//  and static nested class RAM (memory, manufacturer). 
//  Create an object of CPUandprint
// information of Processor and RAM

class Cpu{
    int price;
    Cpu(int p ){
        price=p;
    }
    class Processor{
        int no_of_cores;
        String manufactures;
       Processor(int no , String manu){
           int  no_of_cores=no;
           String manufactures=manu;
        }
        public void display(){
            System.out.println("The number of core is : "+ no_of_cores);
            System.out.println("The manufactures is : "+ manufactures);
        }

    }

    static class Ram{
        String manufactures;
        int memory;
         Ram( int memo,String man){
            manufactures=man;
            memory=memo;
        }void display(){
            System.out.println("The manufactors are  is : "+ manufactures);
            System.out.println("memroy is  : "+ memory);

        }
        
    }
}

class Main{
    public static void main(String args[]){
        Cpu cp =new Cpu(3000);
        Cpu.Processor pros = cp.new Processor(3,"AMD");
        pros.display();

        Cpu.Ram ra = new Cpu.Ram(8,"kingstone");
        ra.display();
        System.out.println("The cpu rite is "+ cp.price);
    }
