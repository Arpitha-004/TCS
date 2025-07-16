import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class input {
    public static void input1(Scanner sc){
        // 4
        // 1 2 3 4 
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i : arr)
            System.out.print(i+" ");
    }
    public static void input1Method2(Scanner sc){
        //4
        //1 2 3 4  using string
        int n = sc.nextInt();
        sc.nextLine();
        String st = sc.nextLine();
        int arr[] = new int[n];
        int j=0;
        for(char ch : st.toCharArray()){
            if(Character.isDigit(ch)){
                arr[j] = Character.getNumericValue(ch);
            j++;
            }  
        }
        for(int i : arr)
            System.out.print(i+" ");
    }
    public static void input2(Scanner sc){
        //Size not specified
        //1 2 3 4
        String st = sc.nextLine();
        String[] sar = st.split(" ");
        List<Integer> arr = new ArrayList<>();
        for(String c : sar){
            arr.add(Integer.parseInt(c));
        }
        for(int i : arr)
            System.out.print(i+" ");
        // for(int i=0;i<arr.size();i++)
        //     System.out.print(arr.get(i)+" ");
    }
    public static void input2Method2(Scanner sc){
        //Size not specified
        //1 2 3 4
        List<Integer> arr = new ArrayList<>();
        while(sc.hasNextLine()){
            arr.add(sc.nextInt());
        }
        for(int i : arr)
            System.out.print(i+" ");
    }
    public static void input3(Scanner sc){
        //Size not specified
        //1,2,3,4
        List<Integer> arr = new ArrayList<>();
        String st = sc.nextLine();
        String[] tok = st.split(",");
        for(String t : tok){
            arr.add(Integer.parseInt(t));
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void input4(Scanner sc){
        //Size not specified
        //[1,2,3,4]
        List<Integer> arr = new ArrayList<>();
        String st = sc.nextLine();
        st = st.substring(1,st.length()-1);
        String[] tok = st.split(",");
        for(String t : tok){
            arr.add(Integer.parseInt(t));
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    /*import java.io.BufferedReader;
    import java.io.InputStreamReader; */
    public static void input5(Scanner sc) throws IOException{
        //If Scanner is not working
        //1,2,3,4
        // !!!!!  throws IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(word);
        int num1 = Integer.parseInt(br.readLine());
        System.out.println(num1);
        double num2 = Double.parseDouble(br.readLine());
        System.out.println(num2);
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        //input1(sc);
        //input1Method2(sc);
        //input2(sc);
        //input2Method2(sc);
        //input3(sc);
        //input4(sc);
        try {
            input5(sc);
        } catch (IOException ex) {
        }
        sc.close();
    }
}
