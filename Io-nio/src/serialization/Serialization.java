package serialization;

import com.sun.java.accessibility.util.GUIInitializedListener;

import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.TreeSet;

public class Serialization implements Serializable {
    public static void main(String[] args) {



    // 1. Сериализация — это процесс сохранения состояния объекта в последовательность байт.
    //    Десериализация — это процесс восстановления объекта из этих байт.
    // 2. последовательность байт,легко передавать по сети и подвеграть десериализации
    // 3. интерфейс java.io.Serializable (не имеет методов. служит макером для JVM)
    // 4. private static final long serialVersionUID = 1L;
    //    уникальный идентификатор версии сериализованного класса - у каждого класса имплем Serializable
    //    при сериализации оно высчитвается (на осонове всех "деталей" класса)
    //    НЕ ПОЛОГАТЬСЯ НА МЕХАНИЗМ СЕРИАЛИЗАЦИИ JAVA для генерации этого значения. ОБЪЯВИ ЯВНО!!!
    //    при десериализации сравнивается serialVersionUID, если не совпадает => InvalidClassException
    //    чтобы избежать этого -> задаем значение вручную
    // 5. Сериализация =>
    //    ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream("путь"));
    //    outS.writeObject(объект);
    //    Десериализация =>
    //    ObjectInputStream inpS = new InputStream(new FileInputStream("путь"));
    //    SavedGame savedGame = (SavedGame) inpS.readObject();
    // 6. Если serialVersionUID отсутствует => InvalidClassException
    // 7. Если класс(кот. сы сериализ) имеет ссылочные поля, то те классы должны быть тоже Serializable
    // 8. transient -> коючевое слово для отключения от сериализации
    //    при записи в док. transient поле получает значение по умолчанию => null для ссылочн. полей
    // 9. 2способ. Сериализуем кл через интерф java.io.Externalizable. необходимо реализовать его 2 метода
    //    writeExternal(ObjectOutput) и readExternal(ObjectInput) (это и есть отличие)
    // 10.  Поля, имеющие модификатор static, не сериализуются
    // 11. Объект, имеющий final-поле, можно сериализовать только через стандартную сериализацию.
    // 12. При наследовании. Сериализация будет распространяться и на дочерний класс.
    // 13. стандартная сериализация работает через Reflection API

















    }
}
