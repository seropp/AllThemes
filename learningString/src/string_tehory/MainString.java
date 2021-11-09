package string_tehory;

import javax.sound.midi.Soundbank;
import java.net.Socket;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainString {
    public static void main(String[] args) {

        String str = "u";
        StringBuilder res = new StringBuilder();

        for (int i = 0;  i<str.length(); i+=4){

            res.append(str.charAt(i));
            if(i+1==str.length())break;
            res.append(str.charAt(i+1));

        }

        System.out.println(res);




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
}


// 1. Реализует интерфейсы Comparable, Serializable и CharSequence (java.lang)
// 2. String - это final класс, immutable класс
// 3. Неизменность объектов == потокобезопасность
// 4. String a = "Hello World"; - строковый литерал (JVM созд. только один экземпляр String)
//    Он становится де-факто константой или синглтоном. поэтому:
//    String b = "Hello World"; a==b -> true
// 5. !!! Самый быстрый способ объединения строк – создать StringBuilder
//    один раз и повторно использовать один и тот же экземпляр внутри цикла
// 6. String Pool (чтобы не плодить множество одинаковых объектов типа String)(Область в Heap)
//    String a = "Hello world"; - при созд. строки происходит проверка  того,
//    имеет ли строковой пул данное значение. Если да, присваивается ссылка на это значение в пуле.
//    Если нет - 1)созд. знач. в пуле 2) присваивается ссылк. на знач в пуле
//    НО если исп. new, то созд. отдельный объект в памяти (и наличие такого знач. в Пуле не имееет значения)
//    Если new String().intern(); -> то объект созд в ПУЛЕ=>
//    String c = new String("Hello world").intern();  a==c TRUE
// 7. Литералы представляют собою фиксированные значения (константы), которые имеют определенный тип. String - литерал
// 8. String -> внутри лежит массив char’ов: private final char value[];
// 9. так как String это массив байт мы можем исп. обёртку java.lang.Character ==> его методы
//      isLetter(), isSpaceChar(), isDigit(), isUpperCase(), isMirrored(), isMirrored()
// 10.
//
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
//  toCharArray(),  isEmpty().
// equals();
//equalsIgnoreCase();
//StartWith();
//EndsWith();
// compareTo() и compareToIgnoreCase()
// lines() -  returns a stream
// "hi ".repeat(3) => hi hi hi (Java 11)

