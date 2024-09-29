package org.example;

public class CalculatorViewClass implements CalculatorView {

    private String firstArgumentAsString;
    private String secondArgumentAsString;

    public CalculatorViewClass(String firstArgumentAsString, String secondArgumentAsString) {
        this.firstArgumentAsString = firstArgumentAsString;
        this.secondArgumentAsString = secondArgumentAsString;
    }

    @Override
    public void printResult(double result){
        System.out.println("Результат вычисления: " + result);
    }

    @Override
    public void displayError(String message){
        System.out.println("Полученная ошибка: " + message);
    }

    @Override
    public String getFirstArgumentAsString(){
        return firstArgumentAsString;
    }

    @Override
    public String getSecondArgumentAsString(){
        return secondArgumentAsString;
    }

}
