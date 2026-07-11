// Last updated: 11/07/2026, 12:32:44
class Solution {
    public double[] convertTemperature(double Celsius) {
        double Kelvin = Celsius + 273.15;
        double Fahrenheit = Celsius * 1.80 + 32.00;
        return new double[]{ Kelvin,Fahrenheit};     
    }
}