import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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

        

        System.out.println(Files.isDirectory(Path.of("A:\\TestFiles\\3file.txt")));
        System.out.println(Files.isRegularFile(Path.of("A:\\TestFiles\\3file.txt")));
        System.out.println(Files.exists(Path.of("A:\\TestFiles\\3file.txt")));
    }
}
