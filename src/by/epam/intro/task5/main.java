package by.epam.intro.task5;

public class main {
    public static void main(String[]args){
        Customer customers[] = new Customer[5];
        customers[0] = new Customer(1195, "Кожемякин", "Павел", "Николаевич",
                "Якуба Колоса", 1234, 7010);
        customers[1] = new Customer(1195, "Бушкен", "Павел", "Николаевич",
                "Якуба Колоса", 6234, 5010);
        customers[2] = new Customer(1195, "Блашко", "Павел", "Николаевич",
                "Якуба Колоса", 8234, 10010);
        customers[3] = new Customer(1195, "Пешко", "Павел", "Николаевич",
                "Якуба Колоса", 7234, 6010);
        customers[4] = new Customer(1195, "Корж", "Павел", "Николаевич",
                "Якуба Колоса", 5234, 2010);
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i].toString());
        CustomerArray customerArray = new CustomerArray(customers);
        System.out.println("Алфавит");
        customerArray = CustomerArrayLogic.sort(customerArray);
        for (int i = 0; i < customerArray.getCustomerArray().length; i++)
            System.out.println(customerArray.getCustomerArray()[i].toString());

        System.out.println("Диапазон");
        customerArray = CustomerArrayLogic.findCustomers(customerArray, 0, 8000);
        for (int i = 0; i < customerArray.getCustomerArray().length; i++) {
            try {
                System.out.println(customerArray.getCustomerArray()[i].toString());
            }catch (NullPointerException e){
                return;
            }
        }
    }
}
