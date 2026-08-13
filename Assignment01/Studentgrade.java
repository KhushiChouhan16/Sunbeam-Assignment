import java.util.Scanner;
public class Studentgrade  {
    public static void main(String[] args){
        int[] arr=new int[5];
        int grade=0;
        System.out.println("give your marks of each subject out of 20");
         Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            grade+=arr[i];
        }
        if(grade>=90 && grade<=100){
            System.out.print("grade A");
        }
        else if(grade>=80 && grade<90){
            System.out.print("grade B");
        
        }
        else if(grade>=70 && grade<80){
            System.out.print("grade C");
        }
        else if(grade>=60 && grade<70){
            System.out.print("grade D");
        }
        else{
            System.out.print("grade F");
        }

    }
}
