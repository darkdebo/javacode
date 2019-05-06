public class add{
        //instance variable declaration
        int a,b;
        //constructor method
        //name same as class
        void add(int c,int d)
        {
           a=c;
           b=d;
           }
        //instance method   
        int sum(int a,int b){
          return a+b;
          }
        //main method 
        public static void main(String[] args){
        //object creation
        add m=new add();
        System.out.println(m.sum(2,3));//call the instance method to add two number
        //return 5
        }
        }
          
