package homework9;

public class MyArraySizeException extends IndexOutOfBoundsException {
private double value;

    public MyArraySizeException() {
        super("Размер массива должен быть меньше 5");
    }
}
