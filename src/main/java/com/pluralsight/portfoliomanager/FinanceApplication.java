package com.pluralsight.portfoliomanager;

import com.pluralsight.portfoliomanager.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FinanceApplication {

    public static void main(String[] args) {
        House house = new House("Ranch house", new BigDecimal("325000.00"), 1998, 1850, 3);
        Gold gold = new Gold("Gold coins", new BigDecimal("12000.00"), 5.0);
        Jewelry ring = new Jewelry("Grandma's ring", new BigDecimal("2500.00"), 14.0);

        System.out.println(house.getName() + ": $" + house.getValue());
        System.out.println(gold.getName() + ": $" + gold.getValue());
        System.out.println(ring.getName() + ": $" + ring.getValue());

        //In main, add a house, some gold or jewelry, a bank account and a credit card.
        House house1= new House("Cottage", new BigDecimal("300000.00"), 1930, 1850, 3);
        Gold gold1 = new Gold("Gold bars", new BigDecimal(18000.00),15.0);
        Jewelry tiara1 = new Jewelry("Amy's tiara", new BigDecimal(5000.00), 24);
        CreditCard.Card();
    //I think i would need to create something like Math.max since math is a static method and Math
        // is a class you wouldnt create new Math in that scenario and I think Credit card would be
        // the same way so I sould mak sure CreditCard.card has a card as a static method. Maybe..
        // but then how I would add that card to the list of valuables is tbd

//        List<Valuable> valuables = new ArrayList<>();
//        valuables.add(0,house1);
//        valuables.add(1,gold1);
//        valuables.add(2,tiara1);
//        System.out.println("ArrayList: " + valuables);

//      replace arrayList with LinkedList. Fix:
        List<Valuable>valuables= new LinkedList<>();

//        valuables= new LinkedList<>();
        valuables.add(0, house1);
        valuables.add(1, gold1);
        valuables.add(2, tiara1);
//        valuables.add(3, ); I want to add CreditCard here somehow
        System.out.println("LinkedList: " + valuables);
        //needs to string now

//        List<String> names = new ArrayList<>();
//        names.add("Ezra");
//        names.add("Ian");
//        System.out.println("ArrayList: " + names);
//
//        names = new LinkedList<>();
//        names.add("Siddalee");
//        names.add("Elisha");
//        System.out.println("LinkedList: " + names);

        // TODO: Workbook 6a p. 30, Part 2
    }

}
