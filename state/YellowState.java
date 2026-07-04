package state;
import enums.LightColor;
import models.TrafficLight;

public class YellowState implements LightState {
    // @Override
    // public void next(TrafficLight light){
    //      light.setState(new GreenState());
    // }
    @Override
    public LightColor getColor(){
        return LightColor.RED;
    }


    
}