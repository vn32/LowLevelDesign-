package com.lld.Behavioral.design.pattern.ChainResponsibility;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
