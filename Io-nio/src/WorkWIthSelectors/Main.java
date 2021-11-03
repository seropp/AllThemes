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

// 1. Селектор проверяет готовность неск Channel's
// 2. => преимущ. нужно меньше потоков(переключение межу потоками дорогостоящее)
// 3. Thread -> Selector -> Some Channels
// 4. Созд. сел.: Selector selector = Selector.open()
// 5. Канал неблокирующего режима, который возвращает
//    экземпляр SelectionKey (FileChannel всегда блокирующий)
//    Регистрация канала:
//    метод SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
//    SelectionKey — это набор операций, которые можно выполнить с каналом
// 6. 2 параметр, это «набор интересов» (их 4 в зависимости от задачи)
//     соединить - SelectionKey.OP_CONNECT | принимать - SelectionKey.OP_ACCEPT
//     читать - SelectionKey.OP_READ | написать - SelectionKey.OP_WRITE
// 7. При регистр. возвр объект SelectionKey, кот. сод. неск. свойств
//      - можем узнать какие операции доступны
//      - узнать какой Набор интересов
//      - вернуть канал и селектор  selectionKey.channel(); selectionKey.selector();
//      - прикрепить объект
// 8. int select() - метод селектора, который возвр. кол. готовых каналов
// 9. Set selectedKeys = selector.selectedKeys(); - этот ключ показ., что есть регистр. каналов с этим селект.
// 10. close()
// 11. wakeup (), после чего поток, ожидающий внутри select (), немедленно вернется.

    }
}
