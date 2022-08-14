package pro.sky.homework211.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.sky.homework211.Basket;
import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> id) {
        List<Integer> basketList = basket.getBasketList();
        basketList.addAll(id);
    }

    public List<Integer> get() {
        return new ArrayList<>(basket.getBasketList());
    }

}
