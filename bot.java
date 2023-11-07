
import java.util.Scanner;
public class bot{
    public static void main(String[] args){
        Scanner myu = new Scanner(System.in);
        System.out.println("Aap Ka Swagat Hai '''<|<|Jai_SHREE_RAM|>|>'''");
        while(true){
            String command = myu.nextLine();
            if(command.equals("namaskar")){
                System.out.println("swagat hai");
            }
            else if(command.equals("how are your sir ")){
                System.out.println("how are you");
            }
            else{
                System.out.println("bye");
            }
        }
       
    }
}
