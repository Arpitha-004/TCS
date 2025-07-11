import java.util.Scanner;

class sumDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int sum = 0;
        for(char c : in.toCharArray()){
            if(Character.isDigit(c)){
                sum+=Character.getNumericValue(c);
            }
        }
        System.out.print(sum);
        sc.close();
    }
}