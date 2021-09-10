package com.amrdevac.SOLID.LSP;

public class Machine {

    public static void main(String[] args) {
        CoffeeMachineFixImplement coffee = new CoffeeMachineFixImplement();
        coffee.prepareDrink();
        coffee.addMilk();

        TeaMachineFixImplement tea = new TeaMachineFixImplement();
        tea.prepareDrink();
        tea.addMilk();
    }
}

abstract class MachineFunction {
    public void prepareDrink() {
        System.out.println("Drink Prepared");
    }

    public abstract void addMilk();
}


class CoffeeMachine extends MachineFunctionFixImplement {
    @Override
    public void addMilk() {
        try {
            throw new Exception("not supported operation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void prepareDrink() {
        System.out.println("Coffe prepared");
    }
}

class TeaMachine extends MachineFunctionFixImplement {
    @Override
    public void addMilk() {
        System.out.println("Milk Added To the tea");

    }

    @Override
    public void prepareDrink() {
        System.out.println("Tea has prepared with milk");
    }
}


//So the problem in here at CoffeeMachine Class we dont need to take the addMilk() method
//so this violating the Liskov Substitution Principle
//