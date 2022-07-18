package dev.lucaslisboa.app;

import dev.lucaslisboa.app.models.machines.DrinkMachine;
import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException{
        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.prepare();
    }
}
