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

    public Heizung(){}

    public void makeItWarmer() {
        int newTemperature = temperature + increment;
        if (newTemperature <= max) {
            temperature = newTemperature;
            System.out.println(newTemperature);
        } else {
            System.out.println("Cannot increase temperature beyond the maximum limit.");
        }
    }

    public void makeItColder() {
        int newTemperature = temperature - increment;
        if (newTemperature >= min) {
            temperature = newTemperature;
            System.out.println(newTemperature);
        } else {
            System.out.println("Cannot decrease temperature beyond the minimum limit.");
        }
    }

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
