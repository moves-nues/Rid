public class Truck extends BigTransport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
        checkTrailer();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
