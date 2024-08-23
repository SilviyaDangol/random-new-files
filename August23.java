public class August23 {
public static int sum(){
    int a = 1;
    int b= 2;
    int sum = a+b;
    return sum;
}
public String sum2(int x){
   String result= "Sum: "+  x;
   System.out.println(result);
   return result;
   

} 
 
public static void main(String[] args) {
    August23 instance1 = new August23();
    int x= August23.sum();
    String y = instance1.sum2(4);
   // int z = August23.sum2();
    System.out.println(x+y);   
}
}
