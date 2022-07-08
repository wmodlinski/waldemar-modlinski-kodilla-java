package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {

        System.out.println(">> >>Zamówienie - >> " + taskName + ".<<");
        System.out.println("Przedmiot w koszyku: " + whatToBuy);
        System.out.println("Ilość: " + quantity);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(quantity == 0) {
            return false;
        } else {
            return true;
        }
    }
}