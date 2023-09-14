public class MyArrayDataException extends RuntimeException {

    private String item;
    private String index;

    public MyArrayDataException(String index, String item) {
        super((String.format("Во входном массиве на позиции: %s находится некорректный элемент: \"%s\"",
                index, item)));
        this.item = item;
        this.index = index;
    }

}
