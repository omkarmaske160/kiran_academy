package variable;

//variable has 3 type 
//1.instance variable , 
//2. static variable
//3. local variable


public class variable {
    int y;// Instance variable    
    String s1="OMKAR"; // static variable
    final long f1= 1478451255;

    public static void main(String[] args) {
        variable b1 = new variable(); // Use 'variable' instead of 'B'
        //variable is class name
        System.out.println(b1.y); // Default value of 'y' is 0
        
        variable c1= new  variable();
        System.out.println(c1.s1);
        
        c1.s1="MASKE";
        //only instance variable can change the value for perticular object 
        //here it  change permentaly for  s1
        System.out.println(c1.s1);
        
        variable b2 = new variable();      
        System.out.println(b2.y); 
        //it create a seprate instance for each variable 
        
        b1.y=100;
        variable b3 = new variable();
        
        System.out.println(b1.y); 
        //only b1.y value change here we are not changing the value of y 
       
        System.out.println(c1.s1);

        System.out.println(b3.y); 
        
        int x=100; // local variable
        if(x==100) {
        	int y=50; //local variable
        	System.out.println(y);
        }
        int y=100;
        System.out.println(y);
        

    }
}
