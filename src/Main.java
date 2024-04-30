public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation  = new ServiceStation();
        Truck truck = new Truck("Грузовик", 6);
        serviceStation.check(truck);

        Car car = new Car("AudiR8", 4);
        serviceStation.check(car);

        Bicycle bicycle = new Bicycle("Stels", 2);
        serviceStation.check(bicycle);
            }
        }


