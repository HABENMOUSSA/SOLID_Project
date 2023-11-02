package com.directi.training.lsp.exercise;

public class PoolForElecDuck
{
    public void run()
    {
        Duck electricDuck = new ElectronicDuck();
        quack( electricDuck);
        swim( electricDuck);
    }

    private void quack(ElectronicDuck... electronicDuck)
    {
        for (ElectronicDuck electronicDuck : electronicDuck) {
        	electronicDuck.quack();
        }
    }

    private void swim(ElectronicDuck... electronicDuck)
    {
        for (ElectronicDuck electronicDuck : electronicDuck) {
        	electronicDuck.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
