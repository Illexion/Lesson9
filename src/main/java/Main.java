public class Main {

    public static void main(String[] args) {

        String[][] array = {{"1", "2", "3", "4"}, {"e2", "5", "6", "7"}, {"8", "2r", "9", "10"}, {"11", "12", "13", "14"}};
       // String[][] array = {{"1", "2", "3", "4"}, {"e2", "5", "6", "7"}, {"8", "2r", "9", "10"}, {"11", "12", "13", "14", "2"}};

        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4)
            throw new MyArraySizeException();

        int q;
        int summ = 0;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                try {
                    q = Integer.parseInt(array[a][b]);
                    summ = summ + q;
                } catch (NumberFormatException | MyArrayDataException e) {
                    System.out.println("Ошибка в ячейке [ " + a + " ][ " + b + " ]");

                } finally {
                    System.out.println(summ);
                }

            }
        }
    }
}