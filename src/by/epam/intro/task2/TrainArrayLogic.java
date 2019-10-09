package by.epam.intro.task2;

import java.util.Arrays;
import java.util.Comparator;

public class TrainArrayLogic {

    public static Train findTrain(TrainArray trainArray, int trainNumber) {
        for (int i = 0; i < trainArray.getTrainArray().length; i++) {
            if (trainArray.getTrainArray()[i].getTrainNumber() == trainNumber)
                return trainArray.getTrainArray()[i];
        }
        return null;
    }

    public static TrainArray sortByNumber(TrainArray trainArray) {
        Train trainBuffer = new Train();
        for (int i = 0; i < trainArray.getTrainArray().length - 1; i++) {
            if (trainArray.getTrainArray()[i].getTrainNumber() > trainArray.getTrainArray()[i+1].getTrainNumber()){
                trainBuffer = trainArray.getTrainArray()[i];
                trainArray.getTrainArray()[i] = trainArray.getTrainArray()[i+1];
                trainArray.getTrainArray()[i+1] = trainBuffer;
            }
        }
        return trainArray;
    }

    public static TrainArray sortByDestination(TrainArray trainArray) {
        Arrays.sort(trainArray.getTrainArray(), new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())) {
                    Integer x1 = ((Train) o1).getDepartureTime();
                    Integer x2 = ((Train) o2).getDepartureTime();
                    return x1.compareTo(x2);
                } else
                    return o1.getDestination().compareTo(o2.getDestination());
            }
        });
        return trainArray;
    }
}
