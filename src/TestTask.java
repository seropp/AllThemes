import java.util.Arrays;
import java.util.StringJoiner;

public class TestTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]
                {"NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH"})));
    }

    public static String[] dirReduc(String[] arr) {
        if(arr.length==0) return new String[]{};
        String x = Arrays.toString(arr).replaceAll(",","").replace("]","").replace("[","");

        while (x.contains("NORTH SOUTH")||x.contains("SOUTH NORTH") || x.contains("EAST WEST") || x.contains(("WEST EAST"))) {
            x = x.replace("SOUTH NORTH","").replace("NORTH SOUTH","")
                    .replace("EAST WEST","").replace("WEST EAST", "")
                    .replaceAll("( )+", " ");
            System.out.println(x);
        }
        if (x.length()==0) return new String[]{};
        return x.trim().split(" ");
    }
}
