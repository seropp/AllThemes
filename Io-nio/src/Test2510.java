import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2510 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream iS = null;
        BufferedOutputStream oS = null;
        try {
            iS = new BufferedInputStream(new FileInputStream("A:\\TestFiles\\Test.txt"));
             oS = new BufferedOutputStream(new FileOutputStream("A:\\TestFiles\\Result.txt"));

            byte[] bytes = new byte[iS.available()];
            bytes = iS.readAllBytes();
            for (int i = 0; i < bytes.length; i++) {
                if( bytes[i] == (int)' '){
                    bytes[i] = '_';
                }
                oS.write(bytes[i]);
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if(iS!=null){
                iS.close();
            }
            if(oS!=null) oS.close();

        }
    }
}
