package state;
import enums.LightColor;
import models.TrafficLight;

public class GreenState implements LightState {
    // @Override
    // public void next(TrafficLight light){
    //      light.setState(new RedState());
    // }
    @Override
    public LightColor getColor(){
        return LightColor.GREEN;
    }


    
}