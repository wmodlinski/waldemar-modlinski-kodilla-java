package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println(">> >>Zlecenie malarskie - >> " + taskName + ". <<");
        System.out.println("Pomalujemy dla Ciebie: " + whatToPaint);
        System.out.println("W kolorze: " + color);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(taskName == null) {
            return false;
        } else {
            return true;
        }
    }
}