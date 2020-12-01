public class Simulation {
    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Bins bin;


    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.bin = new Bins(2, 12);

    }

    public void runSimulation(){
        Dice dice = new Dice(numberOfDies);
        for (int i = 0; i < this.numberOfTosses; i++) {
            Integer rolledNumber = dice.tossAndSum();
            this.bin.increment(rolledNumber);



        }
    }
}
