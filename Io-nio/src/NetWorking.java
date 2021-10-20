import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

public class NetWorking {


    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://flytothesky.ru");
//        InputStream input = url.openStream();
//        byte[] buffer = input.readAllBytes();
//        String str = new String(buffer);
//
////        System.out.println(str);
//
//        InputStream inputStream = Files.newInputStream(Path.of("A:\\TestFiles\\3file.txt"));
//        byte[] buffer1 = inputStream.readAllBytes();
//        String str1 = new String(buffer1);
//        System.out.println(str1);

//        URLConnection connection = (new URL("https://flytothesky.ru")).openConnection();
//        OutputStream outputStream = connection.getOutputStream();
//        outputStream.write(1);
//
//        InputStream inputStream = connection.getInputStream();
//        int date = inputStream.read();
//
//        URLConnection connect = (new URL("https://flytothesky.ru")).openConnection();
//
//        try(PrintStream printStream = new PrintStream(connect.getOutputStream());){
//            printStream.println("HELLO");
//        }
//        catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()))){
//            while (reader.ready()){
//                String string = reader.readLine();
//                System.out.println(string);
//            }
//        }
//        catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }


//
//        try(InputStream inputStream = (new URL("https://www.google.by/images/branding/goo" +
//                            "glelogo/1x/googlelogo_color_272x92dp.png").openStream())){
//            Files.copy(inputStream, Path.of("A:\\TestFiles\\newImage.jpg"));
//        }
//        catch (MalformedURLException ex){
//            System.out.println("неправильная ссылка: "+  ex.getMessage());
//        }
//        catch (Exception exception){
//            System.out.println(exception.getMessage());
//        }
//        try(BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
//        InputStreamReader reader = new InputStreamReader(System.in)) {
//            String a = bufReader.readLine();
//            System.out.println(a);
//
//            System.out.println(reader.read());
//        }
//        catch (IOException ex) {
//            System.out.println(ex.getMessage()+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        }

        PrintStream console = System.out;
        PrintStream filePrint = new PrintStream(new File("A:\\TestFiles\\file.txt"));
        System.setOut(filePrint);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());



        //        System.setOut(console);
//        System.out.println("Dsdsd");
    }
}
