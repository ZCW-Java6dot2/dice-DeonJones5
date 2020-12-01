import java.util.Random;

public class Dice {

    private Integer numberOfDie;
    private Random random;

    public Dice(Integer numberOfDie){
        this.numberOfDie = numberOfDie;
        this.random = new Random();
    }

    public void setSeed(Long seed) {
        random.setSeed(seed);
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for (int i = 0; i < numberOfDie; i++) {
            sum += random.nextInt(6) + 1;
        }
        return sum;
    }
}
