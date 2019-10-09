package by.epam.intro.task2;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Train train[] = new Train[5];
        train[0] = new Train("Витебск", 703, 160);
        train[1] = new Train("Гродно", 701, 200);
        train[2] = new Train("Минск", 702, 240);
        train[3] = new Train("Гомель", 705, 230);
        train[4] = new Train("Минск", 706, 10);
        TrainArray trainArray = new TrainArray(train);
        trainArray = TrainArrayLogic.sortByNumber(trainArray);
        trainArray = TrainArrayLogic.sortByDestination(trainArray);
        System.out.println("Введите номер поезда");
        int trainNumber = in.nextInt();
        Train foundTrain = TrainArrayLogic.findTrain(trainArray, trainNumber);
        System.out.println(foundTrain.getTrainNumber() + " " + foundTrain.getDestination() + " " + foundTrain.getDepartureTime());
    }
}
