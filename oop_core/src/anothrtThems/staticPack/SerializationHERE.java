package anothrtThems.staticPack;

import javax.management.ObjectName;
import java.io.*;

public class SerializationHERE {
    public static void main(String[] args) {
        A a = new A();
        a.name = "Sergey";
        a.city = "Minsk";
        a.company = "ITransion";
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("A:\\here.txt"))) {
            in.writeObject(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Serialization is success");

    }
}
