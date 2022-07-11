package dev.lucaslisboa.app.models.machines;

import dev.lucaslisboa.app.models.products.Chocolate;
import dev.lucaslisboa.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine {


    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
