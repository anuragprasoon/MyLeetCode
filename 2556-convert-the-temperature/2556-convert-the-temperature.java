class Solution {
    public double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        return new double[] {kelvin, fahrenheit};
    }
}
