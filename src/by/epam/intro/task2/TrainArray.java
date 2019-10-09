package by.epam.intro.task2;

public class TrainArray {
    private Train[] trainArray = new Train[5];

    public TrainArray() {}

    public TrainArray(Train[] trainArray){
        setTrainArray(trainArray);
    }

    public void setTrainArray(Train[] trainArray){
        this.trainArray = new Train[trainArray.length];
        for(int i = 0; i < trainArray.length; i++){
            this.trainArray[i] = trainArray[i];
        }
    }

    public Train[] getTrainArray(){
        return trainArray;
    }
}
