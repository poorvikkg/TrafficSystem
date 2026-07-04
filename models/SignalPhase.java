package models;
import enums.Direction;
import enums.LightColor;
import java.util.Map;

public class SignalPhase {
    
    private Map<Direction,LightColor>states;
    

    public SignalPhase(Map<Direction,LightColor>states){
        this.states=states;
     
    }

    public Map<Direction,LightColor>getStates(){
        return states;
    }



}
