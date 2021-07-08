import java.util.ArrayList;

public class Bins {
    private Integer min;
    private Integer max;
    private ArrayList <Integer> tracker;

public Bins(Integer min, Integer max){
    this.min = min;
    this.max = max;
    this.tracker = new ArrayList<>(this.max+1);

    for (int i = 0; i < max; i++) {
        tracker.add(0);

    }
}

    public void increment(Integer binNum){
    Integer counter = tracker.get(binNum);
    tracker.set(binNum, counter+1);

    }

    public Integer getBinCounts(Integer binNum){

        return tracker.get(binNum);

    }



}
