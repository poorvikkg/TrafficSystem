package state;
import enums.LightColor;
import models.TrafficLight;


public interface LightState {
    
    // void next(TrafficLight light);

    LightColor getColor();
}
