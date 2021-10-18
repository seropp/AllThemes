import java.awt.*;
import java.nio.file.Path;

public class UsePath {
    public static void main(String[] args) {
        Path path1 = Path.of("A:\\TestFiles\\1file.txt");


        Path dir = Path.of("A:\\TestFiles\\");
        System.out.println(dir.getFileSystem());
        // sun.nio.fs.WindowsFileSystem@1b28cdfa
        System.out.println(dir.getFileName());
        // TestFiles
        System.out.println(dir.getParent());
        // A:\   (для A:\\ -> null)
        System.out.println(dir.getRoot());
        // A:\
        System.out.println(path1.startsWith("A:\\TestFiles\\"));
        System.out.println(path1.startsWith("A:\\"));
        // true
        System.out.println(dir.getNameCount());
        System.out.println(path1.getNameCount());
        // 1, 2          индекс начинается с 0
        System.out.println(path1.getName(0));
        System.out.println(path1.getName(1));
        System.out.println(Path.of("TestFiles\\1file.txt").isAbsolute());
        System.out.println(Path.of("TestFiles\\1file.txt").isAbsolute());
        System.out.println(Path.of("A:\\TestFiles\\1file.txt").isAbsolute());
        // false, true  абсолютный начин с A:\\ (C:\\)
        System.out.println(Path.of("TestFiles\\1file.txt").toAbsolutePath());
        // A:\AllThems\TestFiles\1file.txt
        System.out.println(Path.of("A:\\TestFiles\\..\\1file.txt").normalize());
        System.out.println(Path.of("A:\\TestFilesdwdwdw\\..\\1file.txt").normalize());
        // A:\1file.txt,  A:\1file.txt

    }
}
