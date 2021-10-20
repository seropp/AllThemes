import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class WriterReader {
    public static void main(String[] args) throws IOException {


//        try(PrintWriter printWriter = new PrintWriter(new FileWriter("A:\\TestFiles\\1file.txt"),true);
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
//                String str = bufferedReader.readLine();
//                printWriter.println(str);
//        }
//        catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


//        try(FileWriter fileWriter = new FileWriter("A:\\TestFiles\\1file.txt", true);
//                Scanner sc = new Scanner(System.in)) {
//            String x = sc.nextLine();
//            System.out.println(x);
//            fileWriter.write(x);
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

//        try( FileReader fileReader = new FileReader("A:\\TestFiles\\1file.txt")) {
//                char[] buf = new char[256];
//                int c;
//            while ((c=fileReader.read(buf))>0){
//                if(c<256){
//                    buf = Arrays.copyOf(buf,c);
//                }
//                System.out.println(buf);
//            }
//
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }


//        if(!Files.exists(Path.of("A:\\TestFiles\\WOW.txt"))) {
//            Files.createFile(Path.of("A:\\TestFiles\\WOW.txt"));
//        }
        try (        BufferedReader bufferedReader = new BufferedReader(new FileReader("A:\\TestFiles\\WOW.txt"))){

            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        PrintWriter writer = new PrintWriter("the-file-name.txt", StandardCharsets.UTF_8);
    }
}
