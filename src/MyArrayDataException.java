public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super("Не удалось преобразовать к int ячейку с индексом [" + i + "][" + j + "]");
    }


}
