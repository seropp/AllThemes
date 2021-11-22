package regularEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegEx {
    public static void main(String[] args) {
        someMethod(new ArrayList<>(Arrays.asList("The Java langguage language", "dwdw ere", "23D221", "Here AM", "The END")));
    }

    static void someMethod(ArrayList<String> text) {
        Pattern pattern = Pattern.compile("");
        for (String s : text) {
            if (s.matches("[^drp]an")) {
                System.out.println(s);
            }
        }
//        String[] arr = text.split("\\b");
//        String[] arr1 = text.split("\b");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
    }

/*
    RegularEX                                                               PART 1

    1. API Regex находится в java.util.regex
    2. Представлен 3 классами:   Pattern, Matcher и PatternSyntaxException
    3. Поиск по шаблону также возможен благодаря методам String
        * boolean matches (String regex)

    Pattern
       * Объ. Pattern, (шаблонами) представляют собой скомпилированные REx.
       * Pattern pattern = Pattern.compile(..., flag); (констр. private) flag в виде второго параметра,
         напр.: Pattern.CASE_INSENSITIVE); - игнор регистра  (можно группировать |)

       * pattern() - возвращает исходную строку REx
       * flags() - возвращает флаги
       * matcher(input) -  создает объект Matcher, ищущий соответствие в тексте input
       * split()
    !!!* matches(regex, input) - позволяет сэкономить на создании
         объектов Pattern и Matcher при одноразовом поиске по шаблону.
    !!!* asPredicate()- возвр Predicate для работы с filter() в API Stream

    Matcher
        * Объ. Matcher, (сопоставители) представляют собой механизмы интерпретации шаблонов
        для обнаружения совпадений в символьных последовательностях

        * 1. find() 2. matches()-весь текст соотв. шаблону 3. lookingAt()-часть текста соотв. шаблону
        * reset() сбрасывает состояние сопоставителя
        Добавление текста в конец
        * appendReplacement(StringBuffer sb, String replacement)
          appendTail(StringBuffer sb) добавляет весь текст в объект
        Методы для определения позиций совпадений
        * start(),  end()








    RegularEx
    ВЕЗДЕ ДВОЙНОЙ ОБРАТНЫЙ СЛЭШ!!! \\
1.  . - метасимвол, обозначающий любой другой | (a.b) == abc
    Чтобы указать просто точку или др. метасимвол можно: написать  \. или  \Q.\E (\\. \\Q.\\E)

2.  Классы символов Исп. []
    Объединение классов символов [a-d[m-p]] (от a до d и от m до p)
    Пересечение классов символов [a-z&&[d-f]] (d, e и f.) (символов, общих для всех вложенных классов)
    Вычитание классов символов  [a-f&&[^e-k]&&[^a]]
    Предопределенные классы символов:
     (категория стандартных классов:)
     \\d == [0-9] \\D == [^0-9] \\s == пробельные символы \\S == [^\s] Разделители строк  \n \r
     \\w == Словообразующий символ [a-zA-Z_0-9].  (\w* любое кол.) \\W == [^\w]

3.  Захватываемые группы - capturing group
     группа рассматривается как единое целое (Java)
     находит все вхождения => для метода replace() [bc] - обрабоетает одно совпадение, а [(bc)] - все
     (Java( language)) - одна захват. гр. вложена в другую каждая влож.гр. имеет номер | (a(b)) a-1 b-2 | (a)(b) a-1 b-2
     К сохраненным захватываемыми группами совпадениям можно позднее обратиться при помощи обратных ссылок
4.  Граничные сопоставители
    ^: Начало строки; $: Конец строки;
    \b: Граница слова; \B: Граница псевдослова; \A: Начало текста; \G: Конец предыдущего совпадения;
    \Z: Конец текста, не считая итогового разделителя строк (если таковой присутствует); \z: Конец текста

    Квантификаторы
        * Жадный квантификатор (самого длинного совпадения.)
        -> X?(0-1) X+(1++) X*(0++) X{n}(n) X{n,}(n++) X{n,m}(n-m)
        * Ленивый квантификатор (самого короткого совпадения) Добавляем ?
        -> X?? X+? X*? X{n}? X{n,}? X{n,m}?
        * Сверхжадный квантификатор (одну попытку найти самое длинное совпадение) Добавляем +
        -> X?+ X++ X*+ X{n}+ X{n,}+ X{n,m}+
    Регулярное выражение \s+ служит для поиска одного или более пробельных символов во входном тексте.





*/





}
