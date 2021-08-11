package collection_and_generics;

public class GenericArray<T> {

    private T[] array;

    // Contructor.
    public GenericArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    // Возвращает последний элемент массива.
    public T getLastElement() {
        if (this.array == null || this.array.length == 0) {
            return null;
        }
        return this.array[this.array.length - 1];
    }

    public static void main(String[] args) {
        GenericArray<String> genericArray = new GenericArray<>(new String[8]);
        System.out.println(genericArray.getLastElement());
    }

}
