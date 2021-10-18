// 18.10

import java.io.*;
import java.util.stream.Stream;

public class IoNioPart1 {
    public static void main(String[] args) {

        System.out.println("x");
        // т.к System.out является объектом класса PrintStream, мы можем сделать слеующее:
        PrintStream printStream = System.out;
        printStream.println("Y");

    }
}

// Перезапись данных из одного файла в другой (через потоки байтов)
// простой способ
class DateTransfer{
    public static void main(String[] args) {


//        try (FileInputStream file1 = new FileInputStream("A:/TestFiles/1file.txt");
//             OutputStream file2 = new FileOutputStream("A:/TestFiles/2file.txt")){
//
////            while (file1.available() > 0) {
//                byte[] buffer = file1.readAllBytes();
//                file2.write(buffer);
//                System.out.println("_");
////            }
//        }
//
//        catch (IOException exception){
//            System.out.println("ОШИБКА: "+exception);
//        }
//        String r = "A:\\TestFiles\\2file.txt";
//        String w = "A:\\TestFiles\\1file.txt";
//        try(FileReader reader = new FileReader(r);
//        FileWriter writer = new FileWriter(w)){
//            while (reader.ready()){
//                reader.transferTo(writer);
//            }
//        }
//        catch (IOException ex){
//            System.out.println("ОШИБКАЖ:" + ex.getMessage());
//        }

//        try(BufferedReader reader1 = new BufferedReader(new FileReader("A:\\TestFiles\\2file.txt"));
//            BufferedReader reader2 = new BufferedReader(new FileReader("A:\\TestFiles\\1file.txt"));
//            FileWriter writer = new FileWriter("A:\\TestFiles\\2file.txt")){
//            String x = reader2.readLine();
//            writer.write("Я точно стану программистом в ближайшие 5 месяцев" + reader2.readLine());
//        }
//        catch (IOException e){
//            System.out.println("Ошибка: "+e.getMessage());
//        }
        try(StringWriter stringWriter = new StringWriter()){
            stringWriter.write("yes");
            stringWriter.write(34);
            System.out.println(stringWriter.toString());
        }
        catch (IOException e){
            System.out.println("Ошибка: "+e.getMessage());
        }
    }
}