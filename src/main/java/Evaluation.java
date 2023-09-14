public class Evaluation {

    public int sum(String[][] array) {
        final int DIMENSION_HEIGHT_OF_ARRAY = 4;
        final int DIMENSION_WIDTH_OF_ARRAY = 4;

        if (array.length != DIMENSION_HEIGHT_OF_ARRAY || array[0].length != DIMENSION_WIDTH_OF_ARRAY) {
            throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("[%s,%s]", i, j), array[i][j]);
                }
            }
        }
        return sum;

    }

}
