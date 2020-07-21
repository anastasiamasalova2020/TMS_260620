package com.tms.impstimp;

import com.tms.model.Airplane;
import static java.lang.Math.*;

public class ImportExample {
    public static void main(String[] args) {
        Airplane air = new Airplane();

        double rad = 5.5;

        System.out.println("Площадь круга: " + squareOfCircle(rad));
    }

    private static double squareOfCircle(double radius) {
        abs(radius);
        log(radius);
        getExponent(radius);
        return PI * pow(radius, 2);
    }
}
