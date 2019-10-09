package by.epam.intro.task5;

public class CustomerArray {
    private Customer[] customers;

    public CustomerArray() {}

    public CustomerArray(Customer[] customers) {
        this.customers = customers;
    }

    public void setCustomerArray(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomerArray() {
        return customers;
    }
}
