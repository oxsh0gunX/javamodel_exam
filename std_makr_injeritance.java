class Student{
    String name;
    int rollno;
    int mark;
    public void getstudentdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Entert the name : ");
    name =sc.next();
    System.out.println("Entert the rollno : ");
    rollno =sc.nextInt();
    System.out.println("Entert the mark : ");
    mark =sc.nextInt();
    }
    public void display(){
        System.out.println("student name is "+name);
        System.out.println("student rollno  is "+rollno);
        System.out.println("student mark is "+mark);
    }
    
    }
    class Sports{
        int sport_score;
        public void getscore(){
            
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the score here :");
         sport_score=sc.nextInt();
    


        }public  void display(){
            System.out.println("the score is " + sport_score);
        }


    }
 class Result extends Student{
    int result;
       Sports sp = new Sports();
       public void show_data(){
        display();
        sp.display();
        result=mark+ sp.sport_score; 
        System.out.println("The result is "+ result);
       }
 }

 class Main{
    public static void main(String args[]){
        Result rc = new Result();
        rc.getstudentdata();
        rc.sp.getscore();
        rc.show_data();
    }
