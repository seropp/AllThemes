package realisation;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetHTMLCode {
    public static void main(String[] args) {

        bruteForceDirectory("A:\\TestFiles", "*.txt");
    }

    public static void getHTMLCode (){
        try(InputStream input = new URL(
                "https://www.luxuryestate.com/p106049225-apartment-complex-for-sale-okinawa").openStream())
        {
            byte[] buffer = input.readAllBytes();
            String str = new String(buffer);
            System.out.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void establishConnection()  {
        URLConnection urlConnection = null;
        try {
            urlConnection = (new URL("https://www.luxuryestate.com/p106049225-apartment-complex-for-sale-okinawa"))
                    .openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (
//                OutputStream oS = urlConnection.getOutputStream();
        InputStream iS = urlConnection.getInputStream()){

//            oS.write(213);
             byte[] buffer = iS.readAllBytes();
             String str = new String(buffer);
            System.out.println(str);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void bruteForceDirectory (String catalog, String pattern){
        Path path = Paths.get(catalog);
        if(!Files.exists(path) || !Files.isDirectory(path)) {
            System.out.println("It isn't a directory, or this directory doesn't exist");
        }
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path, pattern)){
            int count = 0;
            for (Path p: directoryStream) {
                System.out.println(p);
                count++;
            }
            System.out.println("Total number of files: "+count);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

