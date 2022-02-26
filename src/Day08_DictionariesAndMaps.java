import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08_DictionariesAndMaps {
    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Integer > phoneNumber = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneNumber.put(name,phone) ;
        }
        while(in.hasNext()){
            String s = in.next();

            if(phoneNumber.containsKey(s)){
                Integer no=phoneNumber.get(s);
                System.out.println(s+"=" + no);
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
