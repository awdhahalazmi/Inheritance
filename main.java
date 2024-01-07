package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        System.out.println("Furssah");
        Employeee Awdhah = new Employeee("Awdhah", "IT", 2000.0);
        Director Fares = new Director("fares", "HR", 2000, 20, 12);
        String[] myskills = { " java ", " python " };
        Engineers Mafaz = new Engineers("mafaz", "it", 2000, myskills);
        Salesperson Haya = new Salesperson("haya", "Sales", 7000, 13000);
        System.out.println(Awdhah);
        System.out.println(Fares);
        System.out.println(Haya);
        System.out.println(Mafaz);

    }

}
