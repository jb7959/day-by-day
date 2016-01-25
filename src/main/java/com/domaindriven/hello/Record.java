package com.domaindriven.hello;

import java.io.Serializable;

/**
 * Created by tony on 2016. 1. 22..
 */
public class Record implements Serializable {

    private String date;
    private String revenueOrExpense;
    private String amount;
    private String balance;
    private String summary;
    private String category;

    public Record(String date, boolean isRevenue, String amount, String balance, String summary, String category) {
        this.date = date;
        if(isRevenue){
            revenueOrExpense = "수입";
        }else {
            revenueOrExpense = "지출";
        }
        this.amount = amount;
        this.balance = balance;
        this.summary = summary;
        this.category = category;
    }


    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public String getBalance() {
        return balance;
    }

    public String getSummary() {
        return summary;
    }

    public String getRevenueOrExpense() {
        return revenueOrExpense;
    }

    public String getCategory() {
        return category;
    }
}
