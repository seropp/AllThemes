package anothrtThems.staticPack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationHERE {
    public static void main(String[] args) {
        System.out.println(A.company);

        A obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("A:\\here.txt"))) {
            obj = (A) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj.name);
        System.out.println(obj.city);
        System.out.println(obj.company);
        System.out.println(A.company);

    }
}
