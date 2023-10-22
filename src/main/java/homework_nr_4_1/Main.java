package homework_nr_4_1;

public class Main {

    public static void main(String[] args) {

        Car BMW = new Car(400, 20, true);
        Car Audi = new Car(300, 19, false);
        Car Mercedes = new Car( 200, 18, true);

        System.out.println(Audi.horsepower);
        System.out.println(Mercedes.wheelSize);
        System.out.println(BMW.isAWD);

        BMW.horsepower = 400;
        BMW.wheelSize = 20;
        BMW.isAWD = true;

        BMW.drive();
        System.out.println(BMW.returnAWDStatus());

        System.out.println(BMW.horsepower);
        System.out.println(BMW.wheelSize);
        System.out.println(BMW.isAWD);

        printCarHorsePower(BMW);
        printCarHorsePower(Audi);


        MathOperation mo = new MathOperation();

        System.out.println(mo.sum(3, 2));
        System.out.println(mo.subtraction(3, 2));
        System.out.println(mo.divide(3, 2));
        System.out.println(mo.multiply(3, 2));


    }

    public static void printCarHorsePower(Car inputCar){
        System.out.println(inputCar.horsepower);
    }

}
