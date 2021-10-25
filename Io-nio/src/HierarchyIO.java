import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HierarchyIO {
    public static void main(String[] args) throws IOException{

//
//        // InputStream / OutputStream
//
//        // 1. от InputStream и OutputStream (использывать с BufferedIS и BufferedOS)
//        // Thread-A и Thread-B. когда bytes появляются в Thread-A и они будут автоматически передаваться в Thread-B
//        // Каждый раз, когда данные записываются в PipedOutputStream, они автоматически появляются в PipedInputStream
//        // для этого передаем pOS в конструктор pIS, или явный вызов метода  -  pIS.connect(pOS);
//        PipedOutputStream pOS = new PipedOutputStream();
//        PipedInputStream pIS = new PipedInputStream(pOS);
//        // 2. Используются для чтения массива byte посредством InputStream и записи bytes в массив byte,
//        ByteArrayInputStream bAIS = new ByteArrayInputStream(new byte[23]);
//        ByteArrayOutputStream bAOS = new ByteArrayOutputStream();
//        // 3. Buffered
//        FileInputStream fIS = new FileInputStream("путь.txt"); FileOutputStream fOS = new FileOutputStream("путь.txt");
//        // 4. SequenceInputStream позволяет объединить (concatenate) два или несколько InputStream вместе.
//        // Он считывает от первого byte до последнего byte первого InputStream,
//        // затем делает то же самое со следующим InputStream до последнего InputStream.  Buffered
//        SequenceInputStream sIS = new SequenceInputStream(pIS, fIS);
//        // 5. Для Сериализации и Десереализации объектов. интерфейс Serializable! запрет сериализации - transient
//        // реализуют интерфейс ObjectOutput и ObjectInput, кот. в свою очередь расширяют инт. DataOutput и DataInput
//        ObjectInputStream oIS = new ObjectInputStream(fIS);
//        ObjectOutputStream oOS = new ObjectOutputStream(fOS);
//        // 6. расширяет функционал для наследников. Позволяет переопределять только нужные методы
//        FilterInputStream filterIS = new BufferedInputStream(oIS);
//        FilterOutputStream filterOS = new BufferedOutputStream(oOS);
//        // 7. Используется для чтения примитивных данных из источника данных, особенно источников данных, записанных DataOutputStream.
//        // dOS используется для записи примитивных данных (primitive data) в другой OutputStream
//        // рекомендуется для записи табличных данных, таких как Excel.
//        DataOutputStream dOS = new DataOutputStream(fOS);
//        DataInputStream dIS = new DataInputStream(fIS);
//        // 8.
//        BufferedInputStream buIS = new BufferedInputStream(fIS);
//        // 9. PrintStream - Используется для печати данных в управляемый им OutputStream.
//        // Все методы of PrintStream не создают исключений I/O.
//        // System.out - это очень распространенный и знакомый объект PrintStream
//        PrintStream printStream = new PrintStream(new FileOutputStream("file.txt"));
//
//
//
//        // 1. Работа с массивами символов (не требуют явного закрытия потока)
//        CharArrayReader caR = new CharArrayReader(new char[23]);
//        CharArrayWriter caW = new CharArrayWriter(23);
//        // 2. sW можно не закрывать. sW инкапсулирует StringBuffer. Через append()
//        // можем доб. информ к объекту StringBuffer. sR для чтения String в стиле символьного входного поток
//        // нужно использовать BufferedReader
//        StringWriter sW = new StringWriter();
//        StringReader sR = new StringReader(sW.toString());
//        // 3.Каждый раз, когда данные записываются в PipedWriter, они автоматически появляются в PipedReader
//        // для этого передаем pW в конструктор pR, или явный вызов метода  -  pR.connect(pW); + Buffered
//        PipedWriter pW = new PipedWriter();
//        PipedReader pR = new PipedReader(pW);
//        // 4. оболочки
//        BufferedReader bR = new BufferedReader(new FileReader("file.txt"));
//        BufferedWriter bW = new BufferedWriter(new FileWriter("file.txt"));
//        // 5. FilterReader это абстрактный подкласс.
//        FilterReader filterR = new PushbackReader(new FileReader("file.txt"));
//        // FilterWriter filterW; абстрактный подкласс
//        // 6. является средством чтения символьного потока, которое позволяет символам возвращаться в поток.
//        // наследник FilterReader
//        PushbackReader pbR = new PushbackReader(new FileReader("file.txt"));
//        // 7. преобразуют байтовые потоки в символьные исп Buffered
//        InputStreamReader iSR = new InputStreamReader(new FileInputStream("file.txt"));
//        OutputStreamWriter oSR = new OutputStreamWriter(new FileOutputStream("file.txt"));
//        // 8. Для работы с текстовыми файлами
//        FileReader fR = new FileReader(Files.readString(Path.of("A:\\TestFiles\\3file.txt")));
//        FileWriter fW = new FileWriter("file.txt",true);
//        // 9. Подкласс Writer, который используется для печати форматированных данных в OutputStream или другой Writer,
//        // которым он управляет. Все методы PrintWriter не выдают исключений I/O.
//        PrintWriter printW = new PrintWriter("file.txt");
//
//        InputStream input = Files.newInputStream(Path.of(""));
//        BufferedReader fR = new BufferedReader(new FileReader("A:\\TestFiles\\3file.txt"));
//        String a;
//        while ((a = fR.readLine())!=null) {
//            System.out.println(a);
//        }
//            System.in.close();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println(reader.readLine());
//        PushbackInputStream pushbackInputStream = new PushbackInputStream(System.in);
//        System.out.println(pushbackInputStream.read());

        Path path = Paths.get("A:\\TestFiles\\3file.txt");
        path.getFileName();
        path.getParent();
        path.getFileSystem();
        path.getNameCount();


        // Проверяет, что файл доступен для чтения
        Files.isReadable(Path.of("A:\\TestFiles\\3file.txt"));
        // Проверяет, что файл доступен для записи
        Files.isWritable(Path.of("A:\\TestFiles\\3file.txt"));
        // Проверяет, что файл доступен для выполнения
        Files.isExecutable(Path.of("A:\\TestFiles\\3file.txt"));
        // Проверяет, что два пути указывают на один и тот же файл
        String x = "A:\\TestFiles\\3file.txt";
        Files.isSameFile(Path.of(x), Path.of(x));
        System.out.println("wwwwww");
        System.out.println(Files.isSameFile(Path.of("A:\\AllThems\\3file.txt"),Path.of(String.valueOf(Path.of("3file.txt").toRealPath()))));


    }
}


