package Seminar3.task4;

public class MyArraySizeException extends IllegalArgumentException {
    public MyArraySizeException() {
        super("Массив должен быть 3х3");
    }
}