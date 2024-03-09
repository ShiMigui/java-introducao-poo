package util;

public class Calculator {
    public static final float PI = 3.14159f;

    public static float circumference(float radius){
        return 2 * PI * radius;
    }

    public static float volume(float radius){
        return 4 * PI * radius * radius * radius / 3;
    }
}
