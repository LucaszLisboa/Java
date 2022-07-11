package dev.lucaslisboa.app.models.machines;
import dev.lucaslisboa.app.models.products.Coffee;
import dev.lucaslisboa.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine{

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }
}
