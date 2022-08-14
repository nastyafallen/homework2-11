package pro.sky.homework211.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import pro.sky.homework211.Basket;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value = "prototype")
public class StoreService {
    private final Basket basket;
    private int id;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    @Bean
    public void add(int id) {
        Basket basket = new Basket();
        List<Integer> basketList = basket.getBasketList();
        basketList.add(id);
        Basket.setCounter(+1);
    }

    public List<Integer> get() {
        return new ArrayList<>(basket.getBasketList());
    }
}
