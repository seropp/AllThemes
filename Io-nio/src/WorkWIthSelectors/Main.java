package WorkWIthSelectors;

import realisation.GetHTMLCode;
import serialization.Test0211;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        // Channel AND Buffer


// Channel - миска Buffer - ложка
// 1. Channel - интерф. Java.nio.channels
// 2. Channel - открытое соед. с объектом:
//    (Аппаратн. устр., file, socket, программные компоненты)
// 3. I (Channel -> Buffer) O (Buffer -> Channel)
// 4. Channel аналогичен Stream в IO, но есть 3 отличия:
//    a) С пом. Channel можно читать и записывать. В IO для записи OS, для чтения IS
//    b) Channel может считывать и записывать ассинхронно
//    c) Channel и Buffer имеют связь. Достаточно манипул. Buffer для обработки данных, считанных из
//       Channel или для записи в Channel. (!!! IO не имеет Buffer. Буффер-ориентированный / Потокоориентированный)
// 5. инт. Channel реализуют: SocketChannel, FileChannel, ServerSocketChannel и др..
// _________________________________________________________________________________________________________________
// 1. Buffer - абстратный класс
// 2. контейнер для хранения примитивных данных
// 3. Buffer наследуют -> ByteBuffer, CharBuffer, ShortBuffer
// 4. 4 важнейших термина:
//      1) capacity() возвр. емкость.
//      2) limit() Возвр. предел до которого возможно считывать (0 to limit-1) можно указать limit(capacity)
//      3) position() текущ полож. курсора
//      0 <= mark <= position <= limit <= capacity
//      4) mark() тек.полож.курсора. reset() возвр курсор к mark()
//
//  5. метод clear() сбрассыв все знач. (ДАННЫЕ НЕ ТРОГАЕТ)
//  CharBuffer buffer = CharBuffer.allocate(10); // capacity = 10
//
        RandomAccessFile store = new RandomAccessFile("путь", "rw");
        FileChannel channel = store.getChannel();

    }
}
