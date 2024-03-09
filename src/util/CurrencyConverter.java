package util;

public class CurrencyConverter {
    public static float convert(float vlCota, float qtCota, float pcImposto){
        return vlCota * qtCota * (1 + pcImposto);
    }
}
