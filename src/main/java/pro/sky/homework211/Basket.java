package pro.sky.homework211;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Integer> basketList;
    private static int counter;

    public Basket() {
        this.basketList = new ArrayList<>();
        counter = 0;
    }

    public List<Integer> getBasketList() {
        return basketList;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Basket.counter = counter;
    }
}
