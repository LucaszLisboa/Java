package dev.lucaslisboa.app.models.machines;
import dev.lucaslisboa.app.models.products.HotDrink;
import dev.lucaslisboa.app.models.products.Tea;

public class TeaMachine implements HotDrinkMachine {

   @Override
   public HotDrink makeDrink() {
      return new Tea();
   }
}
