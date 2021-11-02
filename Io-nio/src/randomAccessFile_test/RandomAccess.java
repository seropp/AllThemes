package randomAccessFile_test;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RandomAccess {
    public static void main(String[] args) {

        // 1. позволяет произвольно перемещаться по файлу (метод seek(100); -> переставляет курсор на 100 байт)
        //    seek(0)-> в начало. FileOS и FileIS не позволяют произвольного перемещения
        // 2. "r"-чтение. "rw"-чтение/запись. "rws"-при изменении содерж файла или его метаданных требует
        //    синхронно записывать изменения на физич носитель. "rwd"-изменениеметаданных е влияет
        // 4. RandomAccessFile raf = new RandomAccessFile("seek.txt", "rw");
        // 5.
        // 6.
        // 7.
        // 8.
        // 9.
        // 10.
        // 1.
        // 1.

            try (RandomAccessFile f = new RandomAccessFile("A:\\TestFiles\\file.txt", "rw")) {
                f.seek(0);
                f.write('A');
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }
}
