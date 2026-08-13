public class Fibonacci {
     public static void main(String[] args) {
    int n1=0,n2=1,n3;
   int count=10;
   int[] fibo=new int[count];
   fibo[0]=n1;
   fibo[1]=n2;
   for(int i=2;i<count;i++){
    n3=n1+n2;
    fibo[i]=n3;
    n1=n2;
    n2=n3;
   }
   for(int i=0;i<count;i++){
    System.out.print(fibo[i]+" ");
   }
}
}
