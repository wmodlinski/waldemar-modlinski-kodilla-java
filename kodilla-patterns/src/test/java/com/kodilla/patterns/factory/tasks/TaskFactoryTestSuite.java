package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryPainting() {

        //given
        TaskFactory painting = new TaskFactory();

        //When
        Task kitchenToBePainted = painting.createTask(TaskFactory.PAINTING);
        String taskName = kitchenToBePainted.getTaskName();
        kitchenToBePainted.executeTask();
        kitchenToBePainted.isTaskExecuted();

        //then
        Assert.assertEquals("Malowanie kuchni", taskName);
        Assert.assertEquals(true, kitchenToBePainted.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //given
        TaskFactory driving = new TaskFactory();

        //when
        Task vacation = driving.createTask(TaskFactory.DRIVING);
        String taskName = vacation.getTaskName();
        vacation.executeTask();
        vacation.isTaskExecuted();

        //then
        Assert.assertEquals("Wakacje", taskName);
        Assert.assertEquals(true, vacation.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {

        //given
        TaskFactory shopping = new TaskFactory();

        //when
        Task grandmaShopping = shopping.createTask(TaskFactory.SHOPPING);
        String taskName = grandmaShopping.getTaskName();
        grandmaShopping.executeTask();
        grandmaShopping.isTaskExecuted();

        //then
        Assert.assertEquals("Zakupy babci", taskName);
        Assert.assertEquals(true, grandmaShopping.isTaskExecuted());
    }
}