package com.morronel;

import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> loanMap;

    public PromissoryNote() {
        loanMap = new HashMap<String, Double>();
    }

    public void setLoan(String loaner, double sumOfLoan) {
        this.loanMap.put(loaner, sumOfLoan);
    }

    public double howMuchIsTheDebt(String loaner) {
        if (loanMap.get(loaner) == null) {
            return 0.0;
        }
        else {
            return this.loanMap.get(loaner);
        }
    }
}
