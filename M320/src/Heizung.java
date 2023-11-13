public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(int increment, int temperature, int max, int min){
        this.increment = increment;
        this.temperature = temperature;
        this.max = max;
        this.min = min;

        temperature = 15;
    }

    public int makeItWarmer(int incrementalValue){
        setTemperature(temperature + incrementalValue);
        return temperature;
    }

    public int makeItColder(int decrementalValue){
        setTemperature(temperature - decrementalValue);
        return temperature;
    }

    public Heizung(){}

    public int getTemperature() {
        return temperature;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getIncrement() {
        return increment;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
}
