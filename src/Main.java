public class Main {

    public static final int REQUIREDSIZE = 4; //размер массива

    public static void main(String[] args) {

        String[][] arr = {{"1", "2", "3", "4"},
                {"1", "2", "3", "Четыре"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},

        };

        try {
            System.out.println(sumElements(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


    }

    static int sumElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int value;
        int sum = 0;
        int i = 0, j = 0;

        if (arr.length == REQUIREDSIZE) { //проверка количества строк
            for (i = 0; i < REQUIREDSIZE; i++){
                if (arr[i].length != REQUIREDSIZE) { //проверка количества столбцов
                    throw new MyArraySizeException();
                }
            }
        } else {
            throw new MyArraySizeException();
        }

        try { //проверка типа данных
            for (i = 0; i < REQUIREDSIZE; i++) {
                for (j = 0; j < REQUIREDSIZE; j++) {
                    value = Integer.parseInt(arr[i][j]);
                    sum += value;
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i, j);
        }

        return sum;
    }
}