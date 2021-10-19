import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class AllMethodsFiles {
    public static void main(String[] args) throws IOException {

//        // 1. Files.createFile(Path path)     Создает новый файл (в определенной дир)
//        Files.createFile(Path.of("A:\\TestFiles\\file.txt"));
//
//        // 2. Files.createDirectory(Path path)  - Создает директорию
//        Files.createDirectory(Path.of("A:\\TestFiles\\Ads\\"));
//
//        // 3. Files.createDirectories(Path path) - Создает несколько директорий
//        Files.createDirectories(Path.of("A:\\TestFiles\\Aa\\bb\\d"));
//
//        // 4. Files.delete(Path path)  -  Если директория пуста, удаляет ее. Или DirectoryNotEmptyException
//        Files.delete(Path.of("A:\\TestFiles"));
//
//        // 5. Files.copy(Path source, Path out) - копирует файл source в out.
//        // При условии, что файла out не существовало раньше.Или FileAlreadyExistsException
//         Files.copy(Path.of("A:\\TestFiles\\2file.txt"), Path.of("A:\\TestFiles\\3file.txt"));
//
//         // 6. Files.move(Path source, Path out) - перемещает и переименовывает файл. Если файла нет
//         // NoSuchFileException или FileAlreadyExistsException, если существует
//         Files.move(Path.of("A:\\TestFiles\\file.txt"), Path.of("A:\\TestFiles\\Ads\\t.txt"));

        // 7. boolean isDirectory(Path path)
        // 8. boolean isRegularFile(Path path)
        // 9. boolean exists(Path path)  -  Проверяет, что объект по заданному пути существует
        // 10. long size(Path path)  -  Возвращает размер файла



//        System.out.println(Files.isDirectory(Path.of("A:\\TestFiles\\3file.txt")));
//        System.out.println(Files.isRegularFile(Path.of("A:\\TestFiles\\3file.txt")));
//        System.out.println(Files.exists(Path.of("A:\\TestFiles\\3file.txt")));
//        System.out.println(Files.size(Path.of("A:\\TestFiles\\3file.txt"))); // Размер файла в байтах


        // 15. byte[] readAllBytes(Path path)  -  Возвращает все содержимое файла в виде массива байт
        System.out.println(Arrays.toString(Files.readAllBytes(Path.of("A:\\TestFiles\\3file.txt"))));

        // 16. String readString(Path path)  -  Возвращает все содержимое файла в виде строки
        System.out.println(Files.readString(Path.of("A:\\TestFiles\\3file.txt")));

        // 17. List<String> readAllLines(Path path) - Возвращает все содержимое файла в виде списка строк
        System.out.println(Files.readAllLines(Path.of("A:\\TestFiles\\3file.txt")));

        // 18. Path write(Path path, byte[])  -  Записывает в файл массив байт
        Files.write((Path.of("A:\\TestFiles\\3file.txt")), new byte[]{1,2});

        // 19. Path writeString(Path path, String str)  -  Перезаписывает в файл строку
        Files.writeString((Path.of("A:\\TestFiles\\3file.txt")),"\nДа я точно стану программистом!");

        // 20. DirectoryStream<Path> newDirectoryStream(Path dir)
        // -  Возвращает коллекцию файлов (и поддиректорий) из заданной директории
        // 1) через for-each 2) Этот объект - поток, поэтому close();

        try(DirectoryStream<Path> files = Files.newDirectoryStream(Path.of("A:\\TestFiles"))){
            for (Path path : files)
                System.out.println(path);
        }
        catch (IOException ex){
            System.out.println("Ошибка: "+ex.getMessage());
        }

    }
}