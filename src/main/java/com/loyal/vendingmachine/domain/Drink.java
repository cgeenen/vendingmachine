/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loyal.vendingmachine.domain;

/**
 *
 * @author geene
 */
public class Drink {

    private String Name;
    private Integer Amount;

    public Drink(String Name, Integer Amount) {
        this.Name = Name;
        this.Amount = Amount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }
}
