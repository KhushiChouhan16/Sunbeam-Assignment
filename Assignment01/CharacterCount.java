import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  str=sc.nextLine();
        int upper=0,lower=0,digit=0,other=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' &&ch<='Z'){
                upper++;
            }
            else if(ch>='a' && ch<='z'){
                lower++;
            }
            else if(ch>='0' && ch<='9'){
                digit++;
            }
            else{

                other++;
            }
        }
        System.out.println("Upper case characters: " + upper);
        System.out.println("Lower case characters: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Other characters: " + other);
        sc.close();

    }
}
