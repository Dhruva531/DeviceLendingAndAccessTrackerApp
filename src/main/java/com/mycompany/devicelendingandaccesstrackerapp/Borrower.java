/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devicelendingandaccesstrackerapp;

/**
 *
 * @author dhruva
 */
public class Borrower extends User{
    private String skillLevel;
    private int maxActiveLoan;

    public Borrower( String userId, String name, String email, String phone, String skillLevel, int maxActiveLoan) {
        super(userId, name, email, phone);
        this.skillLevel = skillLevel;
        this.maxActiveLoan = maxActiveLoan;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getMaxActiveLoan() {
        return maxActiveLoan;
    }

    public void setMaxActiveLoan(int maxActiveLoan) {
        this.maxActiveLoan = maxActiveLoan;
    }
    
    public boolean canBorrowMore(int currentLoans) {
    return currentLoans < maxActiveLoan;
}
}
