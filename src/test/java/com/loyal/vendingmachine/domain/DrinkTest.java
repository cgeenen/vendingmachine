/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loyal.vendingmachine.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author geene
 */
public class DrinkTest {

    public DrinkTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Drink.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Drink instance = new Drink("Cola", 3);
        String expResult = "Cola";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Drink.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "NewName";
        Drink instance = new Drink("Name", 3);
        instance.setName(Name);
        assertEquals(Name, instance.getName());
    }
}
