package pro.sky.homework211;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> basketList;

    public Basket() {
        this.basketList = new ArrayList<>();
    }

    public List<Integer> getBasketList() {
        return basketList;
    }

}
