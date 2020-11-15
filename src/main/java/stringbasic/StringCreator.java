package stringbasic;

public class StringCreator {

    public String createStringForHeap() {
        String heap = new String("valami");
        return heap;
    }

    public String createStringForPool() {
        String pool = "valami";
        return pool;
    }
}
