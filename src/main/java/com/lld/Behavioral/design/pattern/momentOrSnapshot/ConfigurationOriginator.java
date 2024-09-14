package com.lld.Behavioral.design.pattern.momentOrSnapshot;

public class ConfigurationOriginator {
    int height;
    int width;
    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public ConfigurationMomento createMomento(){
        return new ConfigurationMomento(this.height,this.width);
    }
    public void restoreFromMomento(ConfigurationMomento configurationMomento){
        this.height= configurationMomento.height;
        this.width= configurationMomento.width;
    }


    public void setHeight(int height) {
        this.height=height;
    }

    public void setWidth(int width) {
        this.width=width;
    }

}
