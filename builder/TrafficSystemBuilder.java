package builder;

import models.TrafficController;
import enums.Direction;
import enums.LightColor;
import models.Intersection;
import models.SignalPhase;
import models.TrafficLight;
import Strategy.FixedTimingStrategy;
import Strategy.TimingStrategy;
import models.TrafficSystem;

import java.util.List;
import java.util.Map;

public class TrafficSystemBuilder {

    public static TrafficSystem build() {

     

        TrafficLight north = new TrafficLight(1, Direction.NORTH);
        TrafficLight south = new TrafficLight(2, Direction.SOUTH);
        TrafficLight east = new TrafficLight(3, Direction.EAST);
        TrafficLight west = new TrafficLight(4, Direction.WEST);

        List<TrafficLight> lights = List.of(
                north,
                south,
                east,
                west
        );

        // Create Signal
        SignalPhase phase1 = new SignalPhase(
                Map.of(
                        Direction.NORTH, LightColor.GREEN,
                        Direction.SOUTH, LightColor.GREEN,
                        Direction.EAST, LightColor.RED,
                        Direction.WEST, LightColor.RED
                )
        );

        SignalPhase phase2 = new SignalPhase(
                Map.of(
                        Direction.NORTH, LightColor.YELLOW,
                        Direction.SOUTH, LightColor.YELLOW,
                        Direction.EAST, LightColor.RED,
                        Direction.WEST, LightColor.RED
                )
        );

        SignalPhase phase3 = new SignalPhase(
                Map.of(
                        Direction.NORTH, LightColor.RED,
                        Direction.SOUTH, LightColor.RED,
                        Direction.EAST, LightColor.GREEN,
                        Direction.WEST, LightColor.GREEN
                )
        );

        SignalPhase phase4 = new SignalPhase(
                Map.of(
                        Direction.NORTH, LightColor.RED,
                        Direction.SOUTH, LightColor.RED,
                        Direction.EAST, LightColor.YELLOW,
                        Direction.WEST, LightColor.YELLOW
                )
        );

        List<SignalPhase> phases = List.of(
                phase1,
                phase2,
                phase3,
                phase4
        );

        // Syrategy

        TimingStrategy strategy = new FixedTimingStrategy();



        TrafficController controller =
                new TrafficController(
                        lights,
                        phases,
                        strategy
                );



        Intersection intersection =
                new Intersection(
                        1,
                        lights,
                        controller
                );

        // Traffic System

        TrafficSystem system = new TrafficSystem();

        system.addIntersection(intersection);

        return system;
    }
}