package com.lld.Behavioral.design.pattern.momentOrSnapshot;

public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker= new ConfigurationCareTaker();
        // initialise state of the originator
        ConfigurationOriginator configurationOriginator=new ConfigurationOriginator(5,10);
        //save the state
        ConfigurationMomento snapshot1=configurationOriginator.createMomento();
        //add it io history
        careTaker.addMomento(snapshot1);

        //originator changing to the new state
        configurationOriginator.setHeight(13);
        configurationOriginator.setWidth(20);

        //store it
        ConfigurationMomento snapshot2=configurationOriginator.createMomento();
        //add to history
        careTaker.addMomento(snapshot2);

        //let's say wrong values set and whe have to undo it
        configurationOriginator.setHeight(1);
        configurationOriginator.setWidth(2);
        //undo
        ConfigurationMomento restoredMomentoObject=careTaker.undo();
        configurationOriginator.restoreFromMomento(restoredMomentoObject);
        System.out.println("Height: "+configurationOriginator.height+ " width: "+configurationOriginator.width);

    }
}
