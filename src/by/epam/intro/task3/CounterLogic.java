package by.epam.intro.task3;

public class CounterLogic {
    public static void increaseNumber(Counter counter) {
        if (counter.getNumber() < counter.getUpLimit()) counter.setNumber(counter.getNumber()+1);
    }
    public static void decreaseNumber(Counter counter) {
        if (counter.getNumber() > counter.getLowLimit()) counter.setNumber(counter.getNumber()-1);
    }
}
