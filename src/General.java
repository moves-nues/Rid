import java.io.Serializable;
public abstract class General implements Servicable {
    private String modelName;
    private int wheelsCount;

    public General(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
            System.out.println("Обслуживаем " + modelName);
            for (int i = 0; i < wheelsCount; i++) {
                updateTyre();
            }
        }  public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    }




