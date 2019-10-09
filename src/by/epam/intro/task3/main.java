package by.epam.intro.task3;

public class main {
    public static void main(String[]args){
        Counter firstCounter = new Counter();
        System.out.println(firstCounter.getNumber()+" "+firstCounter.getLowLimit()+" "+
                firstCounter.getUpLimit());
        Counter secondCounter = new Counter(1, 30, 7);
        System.out.println(secondCounter.getNumber()+" "+secondCounter.getLowLimit()+" "+
                secondCounter.getUpLimit());
        CounterLogic.increaseNumber(secondCounter);
        System.out.println(secondCounter.getNumber()+" "+secondCounter.getLowLimit()+" "+
                secondCounter.getUpLimit());
        CounterLogic.decreaseNumber(secondCounter);
        System.out.println(secondCounter.getNumber()+" "+secondCounter.getLowLimit()+" "+
                secondCounter.getUpLimit());
    }
}
