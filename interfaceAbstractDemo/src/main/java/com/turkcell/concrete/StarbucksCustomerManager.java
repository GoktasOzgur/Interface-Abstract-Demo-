package com.turkcell.concrete;

import com.turkcell.abstracts.BaseCustomerManager;
import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.abstracts.ICustomerService;
import com.turkcell.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer){
        if(customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
            addStar(customer);
        }else{
            System.out.println("Not a valid person" + "\n");
        }
    }

    public void addStar(Customer customer){
        System.out.println("Star added to " + customer.getFirstName() + "\n");

    }


}
