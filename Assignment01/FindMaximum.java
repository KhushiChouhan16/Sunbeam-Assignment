public class FindMaximum {
    public static void main(String[] args){
        int size=args.length;
        int max=Integer.parseInt(args[0]);
        for(int i=0;i<size;i++){
            int current=Integer.parseInt(args[i]);
            if(current>max){
                max=current;
            }
        };
        System.out.println("Maximum value is: " + max);
    }
}