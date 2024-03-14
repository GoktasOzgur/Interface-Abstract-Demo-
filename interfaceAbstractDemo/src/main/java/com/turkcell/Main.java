package com.turkcell;

import com.turkcell.abstracts.BaseCustomerManager;
import com.turkcell.adapters.MernisServiceAdapter;
import com.turkcell.concrete.CustomerCheckManager;
import com.turkcell.concrete.NeroCustomerManager;
import com.turkcell.concrete.StarbucksCustomerManager;
import com.turkcell.entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //true birthYear 1999
        Customer customer1 = new Customer("Özgür","Göktaş", 1999,"12345678912");
        Customer customer2 = new Customer("Özgür","Göktaş", 1998,"12345678912");
        BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter()); //real menris
        BaseCustomerManager customerManagerFake = new StarbucksCustomerManager(new CustomerCheckManager()); //fake check
        BaseCustomerManager customerManager2 = new NeroCustomerManager();
        customerManager1.save(customer1);
        customerManager1.save(customer2);
    }
}