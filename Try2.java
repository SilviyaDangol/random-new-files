public class Try2 {
// public static void main(String[] args) {
     public int display(){
        int a=5;
        int b=6;
        int sum=a+b;
        return sum;
    }
     public static void doNothing(){
        System.out.println("Doing nothing");
}
public static void main(String[] args) {
   Try2 obj=new Try2();
   int a=obj.display();
   System.out.println(a);
}
}
