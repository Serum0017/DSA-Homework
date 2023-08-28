public class Thermostat {
    private double temperature = 73.04;// room temperature for me right now
    private int min;
    private int max;
    public Thermostat(int min, int max){
        this.min = min;
        this.max = max;
    }
    public void setTemperature(double newTemp) throws Exception {
        if(newTemp > max){
            throw new Exception("Temperature set too high!");
        } else if(newTemp < min){
            throw new Exception("Temperature set too low!");
        }
        temperature = newTemp;
    }

    public double getTemperature() {
        return temperature;
    }
}
