package models;

import java.util.Map;
import java.util.List;
import java.util.EnumMap;

import enums.Direction;
import enums.LightColor;
import Strategy.TimingStrategy;

public class TrafficController {

    private final Map<Direction, TrafficLight> lights;
    private final List<SignalPhase> phases;
    private final TimingStrategy timingStrategy;
    private int CurrentPhaseIndex;

    public TrafficController(List<TrafficLight> trafficLights, List<SignalPhase> phases,TimingStrategy timingStrategy ) {
        this.lights = new EnumMap<>(Direction.class);
        this.phases = phases;
        this.timingStrategy = timingStrategy;
        this.CurrentPhaseIndex = 0;

        for (TrafficLight Light : trafficLights) {
            this.lights.put(Light.getDirection(), Light);
        }
    }

    public void start() {
        while(true){
        SignalPhase CurrentPhase = phases.get(CurrentPhaseIndex);

        apply(CurrentPhase);
        printStatus();

        int duration = timingStrategy.getDuration();
        sleep(duration);

        CurrentPhaseIndex = (CurrentPhaseIndex + 1) % phases.size();
        }
    }

    public void apply(SignalPhase CurrentPhase) {

        for (Map.Entry<Direction, LightColor> entry : CurrentPhase.getStates().entrySet()) {

            Direction direction = entry.getKey();
            LightColor color = entry.getValue();

            TrafficLight light = lights.get(direction);

            if (light != null) {
                light.setColor(color);
            }
        }
    }

    private void printStatus() {

        System.out.println("\n===============***==");

        System.out.println("Phase : "
                + (CurrentPhaseIndex + 1));

        for (TrafficLight light : lights.values()) {
            System.out.println(light);
        }

        System.out.println("=======****=============");
    }

    private void sleep(int seconds) {

        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
