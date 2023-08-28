public class ThermostatTester {
    public static void main(String[] args) throws Exception{
        Thermostat t = new Thermostat(0, 100);
        t.setTemperature(50);
        try {
            t.setTemperature(150);
        } catch(Exception e) {
            System.out.println("Crisis averted!");
        }
        try {
            t.setTemperature(-50);
        } catch(Exception e) {
            System.out.println("Crisis averted!");
        }
        System.out.println("Temperature stays at " + t.getTemperature());
        t.setTemperature(-50);// no crisis averted :(
    }
}
