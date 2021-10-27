import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestProject {
    public static void main(String[] args) {
        scan1("A:\\TestFiles", "*.JPG");
    }

    /*Итак, давайте предположим, что у нас есть каталог с именем Images,
    и нам нужно перебирать файлы внутри этого каталога, но нам нужны только файлы .png.
    Мы должны выполнить следующие шаги, чтобы сделать это:

    Получите экземпляр java.nio.file.Path, который указывает на каталог Images.
    Откройте новый java.nio.file.DirectoryStream, используя класс java.nio.file.Files
    и передав в качестве параметров каталог и шаблон (* .png).
    Переберите содержимое каталога, используя экземпляр java.nio.file.DirectoryStream .
    Далее приведен исходный код метода, который сканирует каталог с использованием шаблона,
    переданного в качестве параметра:*/
    public static void scan1(String folder, String pattern) {
        Path dir = Paths.get(folder);
        if (!Files.exists(dir) || !Files.isDirectory(dir)){
            System.out.println("No such directory!");
        }
        try(DirectoryStream<Path> ds = Files.newDirectoryStream(dir, pattern)) {
            int count = 0;
            for (Path path : ds) {
                System.out.println(path.getFileName());
                count++;
            }
            System.out.println();
            System.out.printf("%d Files match the pattern", count);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
