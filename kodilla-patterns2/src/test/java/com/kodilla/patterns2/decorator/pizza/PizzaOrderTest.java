package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTest {

    @Test
    void TestBasicPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //when
        BigDecimal cost = pizzaOrder.getCost();
        String pizzaDescription = pizzaOrder.getIngredients();

        //then
        assertEquals(new BigDecimal(20), cost);
        assertEquals("Pizza z: ser + sos", pizzaDescription);
    }

    @Test
    void TestPizzaWithHam(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);

        //when
        BigDecimal cost = pizzaOrder.getCost();
        String pizzaDescription = pizzaOrder.getIngredients();

        //then
        assertEquals(new BigDecimal(25), cost);
        assertEquals("Pizza z: ser + sos + szynka", pizzaDescription);
    }

    @Test
    void TestPizzaWithHamAndMushrooms(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);

        //when
        BigDecimal cost = pizzaOrder.getCost();
        String pizzaDescription = pizzaOrder.getIngredients();

        //then
        assertEquals(new BigDecimal(28), cost);
        assertEquals("Pizza z: ser + sos + szynka + pieczarki", pizzaDescription);
    }
}
