package com.gyk.java.oop.basics;

public class TravelApplication {

    public static void main(String[] args) {
        Family familyFirst = new Family(new Person[]{new Person("Jonas", "Jonaitis", GENDER.MALE, 30), new Person("Joana", "Jonaitiene", GENDER.FEMALE, 30)}, new Vehicle("Astra", "Opel", 15, 5.5), new TravelDestination("draugai", "Vilnius", 20));
        Family familySecond = new Family(new Person[]{new Person("Petras", "Petraitis", GENDER.MALE, 40), new Person("Paulina", "Petraitiene", GENDER.FEMALE, 37), new Person("Petriukas", "Petraitis", GENDER.MALE, 10)}, new Vehicle("Pulsar", "Nissan", 15, 6), new TravelDestination("poilsis", "Klaipeda", 300));
        //System.out.println(familyFirst);
        TravelManager.printFamilyMembers(familyFirst);
        TravelManager.travel(familyFirst);

        TravelManager.printFamilyMembers(familySecond);
        TravelManager.travel(familySecond);
        TravelManager.changeDestination(familySecond, familyFirst.getTravelDestination());
        TravelManager.travel(familySecond);

    }
}