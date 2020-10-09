public class Int {
    private int value;

    public Int(int value) {
        this.value = value;
    }

    public void swap(Int b) {
        int tmp = b.value;
        b.value = value;
        value = tmp;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        Int test = new Int(1);
        Int test2 = new Int(2);
        System.out.println(test);
        System.out.println(test2);
        test.swap(test2);
        System.out.println(test);
        System.out.println(test2);

    }
}
