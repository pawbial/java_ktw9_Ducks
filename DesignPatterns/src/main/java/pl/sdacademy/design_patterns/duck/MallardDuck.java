package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Duck;
import pl.sdacademy.design_patterns.duck.Strategy.*;

public class MallardDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;

    public MallardDuck () {
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new StandardSwimming();
    }

    @Override
    public void quack() {
        quackingStrategy.quack();
    }

    @Override
    public void swim() {
        swimmingStrategy.swimm();
    }

    @Override
    public void fly() {

        flyingStrategy.flying();
    }
}
