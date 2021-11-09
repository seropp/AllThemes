package regularEX;

public class MainRegEx {
    public static void main(String[] args) {
        String a = "asda dwd3j dk3d3wqd qwd";
        String b = "\\w";
        someMethod(a,b);
//
//  Методы с возможностью принимать регулярные выражения
//  1. split(String regex)
//  2. matches(String regex) - соотв. ли страка рег выр
//  3. replaceAll(String regex, String replacement) | replaceFirst(String regex, String replacement)
//  4.



    }

    static void someMethod(String text, String regEx) {
        String x = text.replaceAll(regEx, "()");
        System.out.println(x);
    }
}

// 1. \\s — поиск символов пробела;
// 2. \\S — поиск любого непробельного символа.
// 3. \\d — соответствует любой одной цифре и заменяет собой выражение [0-9];
// 4. \\D — исключает все цифры и заменяет [^0-9];
// 5. \\w — заменяет любую цифру, букву, а также знак нижнего подчёркивания;
// 6. \\W — любой символ кроме латиницы, цифр или нижнего подчёркивания;
//
//
//
//