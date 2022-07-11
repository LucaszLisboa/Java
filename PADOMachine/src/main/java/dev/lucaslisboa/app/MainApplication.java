package dev.lucaslisboa.app;
import dev.lucaslisboa.app.models.machines.CoffeeMachine;
import dev.lucaslisboa.app.models.machines.DrinkMachine;
import dev.lucaslisboa.app.models.machines.TeaMachine;
import dev.lucaslisboa.app.models.products.Coffee;
import dev.lucaslisboa.app.models.products.Tea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApplication {

    public static void main(String[] args) {
        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.prepare();
    }
//    public static void main(String[] args) throws IOException {
//        System.out.println("Escolha sua Bebida!");
//        System.out.println("0. Coffee");
//        System.out.println("1. Tea");
//        System.out.println("Escolha: ");
//
//        DrinckMachine derinkMachine = new DrinkMachine();
//
//        while(true){
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            int valor = Integer.parseInt(reader.readLine());
//            System.out.println("Valor informado pelo usuário: " + valor);
//
//            if(valor == 0){
//                CoffeeMachine coffeeMachine = new CoffeeMachine();
//                coffeeMachine.makeCoffee();
//                System.out.println(coffee);
//            }
//            if(valor == 1){
//                TeaMachine teaMachine = new TeaMachine();
//                teaMachine.makeTea();
//                System.out.println(tea);
//            }
//        }
//    }
}
