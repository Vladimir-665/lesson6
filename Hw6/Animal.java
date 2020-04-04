package lesson6.Hw6;

abstract class Animal {
    protected int _runDistance;
    protected int _swimDistance;
    protected String name;

    abstract void run(int runDistance);
    abstract void swim(int swimDistance);
 }
