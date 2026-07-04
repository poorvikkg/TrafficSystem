package models;



import java.util.List;

public class Intersection {

    private final int id;
    private final List<TrafficLight> trafficLights;
    private final TrafficController trafficController;

    public Intersection(int id,
                        List<TrafficLight> trafficLights,
                        TrafficController trafficController) {

        this.id = id;
        this.trafficLights = trafficLights;
        this.trafficController = trafficController;
    }

    public int getId() {
        return id;
    }

    public List<TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    public void start() {

        System.out.println(
                "Starting Intersection : " + id);

        trafficController.start();
    }
}