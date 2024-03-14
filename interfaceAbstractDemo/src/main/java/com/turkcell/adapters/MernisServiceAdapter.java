package com.turkcell.adapters;

import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.abstracts.ICustomerService;
import com.turkcell.entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        return customer.getBirthYear() == 1999;
    }
}

