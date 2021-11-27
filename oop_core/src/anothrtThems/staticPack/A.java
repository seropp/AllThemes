package anothrtThems.staticPack;

import java.io.Serializable;

public class A implements Serializable {
    private static final long serialVersionUID = 123943;

    public String name;
    public static transient String city = "MOT" ;
    public static String company ;

    static {
        city = "234";
    }

}