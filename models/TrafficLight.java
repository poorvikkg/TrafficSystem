package models;

import enums.Direction;
import enums.LightColor;


public class TrafficLight {

    private int id;
    private Direction direction;
    private LightColor CurrrentColor;

    public TrafficLight(int id, Direction direction) {
        this.id = id;
        this.direction = direction;
        this.CurrrentColor = LightColor.RED;
    }

    public void setColor(LightColor color) {
        this.CurrrentColor = color;
    }

    public LightColor getColor() {
        return CurrrentColor;
    }

    public int getID() {
        return id;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {

        return direction + " -> " + CurrrentColor;
    }

}
