package accesModifications;

import anothrtThems.staticPack.A;

public class Main {
    public static void main(String[] args) {
        System.out.println(321);
    }
}
class Animals{
    static int count = 10;
}
class Mammals extends Animals{

}
class Cats extends Mammals{}

/*
   | assert | native | volatile
    assert

    1. специальная конструкция, позволяющая проверять предположения о значениях
       произвольных данных в произвольном месте программы. Приводит к аварийному завершению программы
    2. выбрасывает AssertionError
    3. имеет следующую структуру
            assert boolean exercise : "string";

    
    
    


 */