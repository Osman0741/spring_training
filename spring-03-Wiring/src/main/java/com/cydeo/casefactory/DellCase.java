package com.cydeo.casefactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powerSupply,Dimensions dimensions) {
        super(model, manufacturer, powerSupply, dimensions);
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}
