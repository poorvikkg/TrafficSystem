package state;
import enums.LightColor;
import models.TrafficLight;

public class RedState implements LightState {
    // @Override
    // public void next(TrafficLight light){
    //      light.setState(new YellowState());
    // }
    @Override
    public LightColor getColor(){
        return LightColor.RED;
    }


    
}
