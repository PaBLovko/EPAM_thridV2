package by.epam.intro.task5;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerArrayLogic {

    public static CustomerArray sort(CustomerArray customers) {
        Arrays.sort(customers.getCustomerArray(), new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (!o1.getSecondName().equals(o2.getSecondName())) {
                    return o1.getSecondName().compareTo(o2.getSecondName());
                } else if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                } else
                    return o1.getThirdName().compareTo(o2.getThirdName());
            }
        });
        return customers;
    }

    public static CustomerArray findCustomers(CustomerArray customers, int lowerRangeLimit, int upperRangeLimit) {
        Customer[] goodCustomers = new Customer[customers.getCustomerArray().length];
        int k = 0;
        for (int i = 0; i < customers.getCustomerArray().length; i++) {
            if (givenRange(customers.getCustomerArray()[i], lowerRangeLimit, upperRangeLimit)) {
                goodCustomers[k] = customers.getCustomerArray()[i];
                k++;
            }
        }
        return new CustomerArray(goodCustomers);
    }

    private static boolean givenRange(Customer customer, int lowerRangeLimit, int UpperRangeLimit) {
        if (lowerRangeLimit < customer.getBankAccountNumber() && customer.getBankAccountNumber() < UpperRangeLimit)
            return true;
        return false;
    }
}