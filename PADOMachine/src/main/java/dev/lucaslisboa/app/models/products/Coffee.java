package dev.lucaslisboa.app.models.products;

import dev.lucaslisboa.app.models.machines.HotDrinkMachine;

public class Coffee implements HotDrink {

    private int quantity = 3;
    private int temperature = 3;
    private int sugar = 3;

    public Coffee() {}

    @Override
    public String toString() {
        return "COFFEE: {" +
                "\"quantity\":" + quantity +
                ", \"temperature\":" + temperature +
                ", \"sugar\":" + sugar +
                '}';
    }
}
