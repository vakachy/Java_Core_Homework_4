public class Program {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] testArray = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        //String[][] testArray = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2io", "3", "4"}, {"1", "2", "3", "4"}};
        //String[][] testArray = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        Evaluation ev = new Evaluation();

        try {
            int sum = ev.sum(testArray);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }




    }
}
