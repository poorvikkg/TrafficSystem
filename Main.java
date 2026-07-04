import builder.TrafficSystemBuilder;
import models.TrafficSystem;

public class Main {

    public static void main(String[] args) {

        TrafficSystem system =
                TrafficSystemBuilder.build();

        system.start();
    }
}