package tests;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            Files.move(Path.of("A:\\TestFiles\\pic2.jpg"), Path.of("A:\\TestFiles\\Ads\\pic3.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class WorkWithDir{
    static void filesSearch(String path, String pattern){
        Path p = Paths.get(path);

        if (!Files.isDirectory(p) || !Files.exists(p)) {
            System.out.println("No such directory");
            return;
        }
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(p, pattern)) {
            int count = 0;
            for (Path path1 : directoryStream) {
                System.out.println(path1.getFileName()+"\n"+path1.toAbsolutePath()+"\n____");
            }
            System.out.printf("\nFiles match the pattern %d", count);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void saveImageFromInternet(String url, String placeForPic){

        try(InputStream inS = (new URL(url)).openStream()){
            Files.copy(inS, Path.of(placeForPic));
            if(Files.exists(Path.of(placeForPic))) System.out.println("Picture saved successfully");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void allFiles (String sourceDir){
        Path p = Path.of(sourceDir);
        if (!Files.isDirectory(p) || !Files.exists(p)) {
            System.out.println("No such directory");
            return;
        }

        try(DirectoryStream<Path> dirP = Files.newDirectoryStream(p)) {

            for (Path path : dirP) {
                System.out.println(path.getFileName()+"\n"+path.toAbsolutePath());
                System.out.println("______");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
// 1. DirectoryStream<Path> - для получения исп. newDirectoryStream()
//    Он имеет Iterator -> foreach. Нужно исп. close().
// 2.  Files.newInputStream( Path.of( src ) );
//
//
//
//  1. С Java7 на замену File пришли Paths, Path(интерф.) и Files
//     многие методы File возвр. boolean вместо ошибок, из-за чего отладка усложнялась
//  2. Paths - сод 1 метод get(String / URI) возвр Path
//  3. Path - переработанный аналог класса File
//        * убрали многие статические методы, и перенесли их в класс Files.
//  4. Метода Path:
//     Path.of(String / URI) возвр Path  (c Java 11)
//     getFileName() | getParent() | getRoot() | startsWith() | endsWith()
//     isAbsolute() | normalize() | relativize() etc.
//  5. Files - утилитный класс (Содержит статические методы из метода File + новые(copy())
//     Методы Files:
//     createFile() | createDirectory() | move() | delete()
//
//
//
//
//
//
//
//
//
//
//
//
//