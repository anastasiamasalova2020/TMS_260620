package com.tms.model;

import com.tms.model.Airplane;
import com.tms.model.AirplaneType;

public class Runner {

    public static void main(String[] args) {

        Airplane air747 = new Airplane();
        air747.setName("Boeing 747");
        air747.setType(AirplaneType.WEIGHT_PASSENGER);

        Airplane dreamlner = new Airplane();
        dreamlner.setName("Boeing dreamliner");
        dreamlner.setType(AirplaneType.PASSENGER);

        Airplane dreamlner2 = new Airplane();
        dreamlner2.setName("Boeing dreamliner 2");
        dreamlner2.setType(AirplaneType.PASSENGER);

        Airplane[] planes = new Airplane[3];
        planes[0] = air747;
        planes[1] = dreamlner;
        planes[2] = dreamlner2;

        for (int i = 0; i < planes.length; i++) {

            if(planes[i].getType().equals(AirplaneType.PASSENGER)) {
                System.out.println(planes[i]);
            }

        }

    }
}
