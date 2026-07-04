package Strategy;

public class FixedTimingStrategy implements TimingStrategy {
    
      @Override
      public int getDuration(){
        return 5;
      }

}
