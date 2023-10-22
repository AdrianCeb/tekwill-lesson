package homework_nr_4_1;

public class Car {


    int horsepower;
    int wheelSize;
    boolean isAWD;

    public Car(int horsepower, int wheelSize, boolean isAWD){
        this.horsepower = horsepower;
        this.wheelSize = wheelSize;
        this.isAWD = isAWD;
    }

    public void drive(){
        System.out.println("I'm driving");
    }

    public boolean returnAWDStatus(){
        return isAWD;
    }
}
