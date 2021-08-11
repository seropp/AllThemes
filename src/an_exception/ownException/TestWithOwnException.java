package an_exception.ownException;

public class TestWithOwnException {
    public static void main(String[] args) {

        try {


            for (int i = 0; i < 100; i++) {
                if(i/19 == 0){
                    throw new OwnException("Деление на 19");
                }
            }

        }
        catch (OwnException ec) {
            System.out.println(ec);
        }
    }
}
