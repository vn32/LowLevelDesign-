package com.lld.Behavioral.design.pattern.momentOrSnapshot;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMomento> history=new ArrayList<>();
    public void addMomento(ConfigurationMomento configurationMomento){
        history.add(configurationMomento);
    }
    public ConfigurationMomento undo(){
        if(!history.isEmpty()){
            int lastMomentoIndex=history.size()-1;
            ConfigurationMomento lastMomento=history.get(lastMomentoIndex);
            return lastMomento;
        }
        return null;
    }
}
