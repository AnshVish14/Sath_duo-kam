import java.io.*;
class data{
public static void main(String[] args){
    try{
        FileInputStream fin = new FileInputStream("d:\\abc.txt");
        FileOutputStream fout = new FileOutputStream("d:\\xyz.txt");
        int i;
        while((i=fin.read())!=-1)
        {
            try
            {
                fout.write(i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        fin.close();
        fout.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
  }
}
