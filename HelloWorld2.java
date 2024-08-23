
class Main{
    public void display(){
        System.out.println("using method");
    }
     public void doNothing(){
        System.out.println("Doing nothing");

    // public void Sum(){
    //     int a =5;
    //     int b =6;

    //     System.out.println("The sum of a and b is " + a+b);

    }
    }

public class HelloWorld2{
    public static void main (String[] args)
     {
        Main obj = new Main();
        obj.display();
        obj.doNothing();

        // Sum obj = new Sum();
        // obj.sum();
    }
}