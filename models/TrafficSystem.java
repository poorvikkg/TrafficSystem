package models;

import java.util.ArrayList;
import java.util.List;

public class TrafficSystem {

    private final List<Intersection> intersections;

    public TrafficSystem() {
        this.intersections = new ArrayList<>();
    }

    public void addIntersection(Intersection intersection) {
        intersections.add(intersection);
    }

    public void removeIntersection(Intersection intersection) {
        intersections.remove(intersection);
    }

    public void start() {

        for (Intersection intersection : intersections) {

            intersection.start();

        }

    }

}