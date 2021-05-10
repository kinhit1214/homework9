package homework9;

public class Main  {
    public double i = -5;
    public static void main(String[] args) {
        String[][] arr = new String[5][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] =""+(i+j)+"";
            }
        }
        arr[2][3] = "m";
        arrIn(arr);
        arraySumm(arr);
    }
    private static void arrIn (String[][] arr) {
        try {
            if ((arr[0].length == 4) || (arr.length == 4))
                throw new MyArraySizeException();
        }catch (MyArraySizeException e){
            System.err.println("Размер массива должен быть 4 на 4");
        }
        System.out.println();
    }

    private static void arraySumm(String[][] arr) {
           int a = 0;
           int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        try {
                            a = Integer.parseInt(arr[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(arr[i][j]);
                        }
                    }catch (MyArrayDataException e){
                        System.err.println("В ячейке с индексами ["+i+"]["+j+"] лежит не число");
                        return;
                    }
                    sum+=a;
                }
            }
        System.out.println(sum);
        }
}

