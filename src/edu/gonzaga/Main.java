package edu.gonzaga;

class Adder {
    private int val1;
    private int val2;

    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
    }

    private int addVals()
    {
        return val1 + val2;
    }

    public int multVals()
    {
        return val1 * val2;
    }

    private void printResults()
    {
        System.out.println("Sum: " + addVals());
        System.out.println("Product: " + multVals());
    }

}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);

        System.out.println("App finished.");
    }
}