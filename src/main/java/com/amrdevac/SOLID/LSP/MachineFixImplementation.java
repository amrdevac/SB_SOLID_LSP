package com.amrdevac.SOLID.LSP;

public class MachineFixImplementation {
    public static void main(String[] args) {
//        Parent Class                          Child class
        MachineFunctionFixImplement coffee = new CoffeeMachineFixImplement();
        coffee.prepareDrink();

        MachineFunctionFixImplement tea = new TeaMachineFixImplement();
        tea.prepareDrink();
        tea.addMilk();

        MachineFunctionFixImplement milkshake = new MilkShake();
        milkshake.addMilk();
        milkshake.prepareDrink();
    }
}

abstract class MachineFunctionFixImplement {
    public abstract void prepareDrink();

    public void addMilk() {
        System.out.println("Milk Added");
    }
}


class CoffeeMachineFixImplement extends MachineFunctionFixImplement {


    @Override
    public void prepareDrink() {
        System.out.println("Coffe prepared");
    }
}

class TeaMachineFixImplement extends MachineFunctionFixImplement {
    @Override
    public void addMilk() {
        System.out.println("Milk Added To the tea");

    }

    @Override
    public void prepareDrink() {
        System.out.println("Tea has prepared with milk");
    }
}

//if we wanna add more feature we just gonna added new class

class MilkShake extends MachineFunctionFixImplement {

    @Override
    public void addMilk() {
        System.out.println("Milk added in shake");
    }

    @Override
    public void prepareDrink() {
        System.out.println("Milkshak is added");
    }
}