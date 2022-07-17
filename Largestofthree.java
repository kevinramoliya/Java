public class Largestofthree{
    public static void main(String[] args){
        int a=25;
        int b=68;
        int c= 49;

        int result = (a>b) ? (a>c ? a:c) : (b>c ? b:c);

        System.out.println(result);

    }
}