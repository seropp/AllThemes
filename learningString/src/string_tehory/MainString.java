package string_tehory;

import javax.sound.midi.Soundbank;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.text.Format;
import java.util.*;
import java.util.stream.Collectors;

public class MainString {
    public static void main(String[] args) {

    currantDate();



//        printTable();
//        String[] strings = new String[]{"one", "two", "three", "four", "five" };
//        String result = null;
//        for(String str : strings) {
//            result = result + str;  // result = new StringBuilder(result).append(str).toString();
//                                    // new StringBuilder(result) - при каждой итерации копирует все символы
//                                    // каждая новая итерация все медленее
//        }
//        //НУЖНО исп 1 StringBuilder!!!
//        StringBuilder stBuild = new StringBuilder();
//        for(String str : strings) {
//            stBuild.append(str);
//        }
//        result = stBuild.toString();
    }

    static void printTable (){
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j < 11; j++) {
                System.out.printf("| %2d * %-2d = %3d |", i, j, (i*j));
            }
        }
    }
    static  void currantDate() {
        Formatter formatter = new Formatter();
        Formatter formatter1 = new Formatter();
        Formatter formatter2 = new Formatter();
        Formatter formatter3 = new Formatter();
        Formatter formatter4 = new Formatter();
        Formatter formatter5 = new Formatter();
        formatter.format("tH = %tH  tM = %tM  tS = %tS ", new Date(),new Date(),new Date());
        // Current time: 16 hours, 46 minutes, 59 seconds
        formatter1.format("Current time: %tH:%tM:%tS", new Date(),new Date(),new Date());
        // Current time: 16:46:59
        formatter2.format("%-2tI : %-2tM : %-2tS", new Date(),new Date(),new Date());
        // 04 : 49 : 53
        formatter3.format("tY = %-2tY, ty = %2ty, tB = %2tB, tb = %2tb, tm = %2tm" , new Date(),new Date(),new Date(),new Date(),new Date());
        //tY = 2021, ty = 21, tB = ноября, tb = нояб., tm = 11
        formatter4.format("tA = %2tA, ta = %2ta, td = %2td",new Date(),new Date(),new Date());
        //tA = среда, ta = ср, td = 10
        formatter5.format("tc = %tc", new Date());




        System.out.println(formatter);


    }
}

/*
    Formatter.format(), String.format(), PrintStream.format() и PrintWriter.format(), printf()
    Все они используют Formatter.format()
    IllegalFormatConversionException - неверный тип

    1. Правила форматирования:
        %[argument_index$][flags][width][.precision]conversion-character

    % - начало инструкций форматирования.
    ARGUMENT_INDEX$ - позицию аргумента в списке аргументов (1$, 2$)
    CONVERSION-CHARACTER
     d(целоч), f(дроб), b, B, c, C, s, S, h(hashcode), n
     Заглавне буквы обеспечивает перевод символов в верхний регистр.
    WIDTH
     width - задает минимальное пространство (количество символов),
     которое требуется для печати содержимого соответствующего аргумента.
     -30s -> 30 width
    FLAGS
     '-' - выравнивание по левому краю (по умолчанию выравнивание по правому краю)
     '+' - вывести знак плюса (+) или минуса (-) для числового значения
     '0' - принудительное заполнение числовых значений нулями (по умолчанию пустое заполнение)
     ',' - разделитель групповых запятых (для чисел> 1000) (пробелом)
     ' ' - пробел отобразит знак минус, если число отрицательное, или пробел, если оно положительное
     Порядок флагов не имеет значения
    PRECISION (точность)
     точка + число
     количество нулей после запятой: .2 - двачисла после запятой


        // %tH = 17, %tI = 5, %tM = 01, tS = 16, %tL - милисекунды
        // %tY = 2021, %ty = 21, %tB = ноября, %tb = нояб., %tm = 11
        // %tA = среда , %ta = Ср., %td = 10
        // %tR = 16:56 (То же что и "%tH:%tM")
        // %tT = 16:57:12 (То же что и "%tH:%tM:%tS")
        // %tr = 04:57:39 PM (То же что и "%tI:%tM:%tS %Tp" где %Tp = (AM или PM))
        // %tD = 11/10/21 (То же что и "%tm/%td/%ty")
        // %tF = 2021-11-10 (То же что и "%tY–%tm–%td")
        // %tc = ср нояб. 10 16:59:38 MSK 2021(То же что и "%ta %tb %td %tT %tZ %tY")




*/
/*

 1. StringBuffer (mutable, final) Потокобезопасный. С Java1
 2. StingBuilder (mutable, final) Не потокобезопасен. С Java5
 3. Реализуют абстр класс AbstractStringBuilder
    Интерфейс CharSequence(как и String), Appendable и Serializable
 4. Первоначальная емкость (capacity) == 16. При заполнении увел.: newCapacity = oldCapacity * 2 + 2
 5. Методы
    * Конкатенация append() (может принимать любой тип данных). insert() доб. по определ. индексу
    * charAt() получает, setCharAt(0, 'c') устанавливает, getChars()
    * delete(0,2) (не вкл.), deleteCharAt()
    * substring() | setLength() - обрезает строку либо дополняет пустыми
    * replace(6,11,"java");
    * reverse()
    * trimToSize() -> capacity


 1. StringJoiner(c Java8). Java.util
 2.   StringJoiner joiner = new StringJoiner(",", PREFIX, SUFFIX);
 3. add() - добавление строк
 4. Если мы хотим объединить все элементы списка, нам придется выполнить цикл по списку.
    НО для этого можно использовать String.join()
 5. Можем объеденить 2 joiner joiner1.merge(joiner2);
 6. В StreamAPI -> collect(Collectors.joining(","))
 7. String.join() -> чтобы напрямую присоединиться к String


*/

// 1. Реализует интерфейсы Comparable, Serializable и CharSequence (java.lang)
// 2. String - это final класс, immutable класс
// 3. Неизменность объектов == потокобезопасность
// 4. String a = "Hello World"; - строковый литерал (JVM созд. только один экземпляр String)
//    Он становится де-факто константой или синглтоном. поэтому:
//    String b = "Hello World"; a==b -> true
// 5. !!! Самый быстрый способ объединения строк – создать StringBuilder
//    один раз и повторно использовать один и тот же экземпляр внутри цикла
// 6. String Pool (String Pool - это хэш-таблица)(Область в Heap(«Perm Gen»))
//    String a = "Hello world"; - при созд. строки происходит проверка  того,
//    имеет ли строковой пул данное значение. Если да, присваивается ссылка на это значение в пуле.
//    Если нет - 1)созд. знач. в пуле 2) присваивается ссылк. на знач в пуле
//    НО если исп. new, то созд. отдельный объект в памяти (и наличие такого знач. в Пуле не имееет значения)
//    Если new String().intern(); -> то объект созд в ПУЛЕ=>
//    String c = new String("Hello world").intern();  a==c TRUE
//    ОДНАКО пул ограничен количеством bucket's, поэтому явное помещение через intern() может привести
//    к перегрузке(не происходит автоматического увелечения)
// 7. Литералы представляют собою фиксированные значения (константы), которые имеют определенный тип. String - литерал
// 8. String -> внутри лежит массив char’ов: private final char value[];
// 9. Так как String это массив байт мы можем исп. обёртку java.lang.Character ==> его методы
//      isLetter(), isSpaceChar(), isDigit(), isUpperCase(), isMirrored(), isMirrored()
// 10. equals() медленнее ==, поскольку он выполняет посимвольное сравнение строк. (== проверяет идентичность)
// 11. String.join & StringJoiner при объеденении большого числа строк(массивы, коллекции etc.)
//
//
//
//
//
//
//
//
//  equals(), equalsIgnoreCase(), trim(), String.valueOf() - примитив или объект в String
//  Integer.parseInt(), Double.parseDouble() - Перевод строки в число
//  join(delimiter - разделитель, elements - массив или коллекция) - Перевод коллекции строк к строковому представлению
//  split(String regex) - (regex -  строковое регулярное выражение
//  indexOf(), lastIndexOf() -> char, String  ИЛИ -1
//  substring(int beginIndex, int endIndex) - Извлечение подстроки из строки
//  toLowerCase(), toUpperCase()
//  string1.concat(string2); - Объединение строк в Java
//  contentEquals(StringBuffer sb),
//  static String copyValueOf(char[] data) - (массив символов в String)
//  boolean endsWith(String suffix) | startsWith(String prefix)
//  byte getBytes() - строку в массив байт
//  void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) Копирует символы из этой строки в массив символов назначения.
//  boolean matches(String regex), str1.regionMatches(true(игрнор. регистр),индВ1,str2,индВ2, колСимаСравн); сравнивает подстроки в строках
//  toCharArray(),  isEmpty(), isBlank()
// equals();
//equalsIgnoreCase();
//StartWith();
//EndsWith();
// compareTo() и compareToIgnoreCase()
// lines() -  returns a stream
// "hi ".repeat(3) => hi hi hi (Java 11)

