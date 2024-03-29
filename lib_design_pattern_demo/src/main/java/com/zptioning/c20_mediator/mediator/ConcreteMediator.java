package com.zptioning.c20_mediator.mediator;

import com.zptioning.c20_mediator.colleague.Alarm;
import com.zptioning.c20_mediator.colleague.CoffeeMachine;
import com.zptioning.c20_mediator.colleague.Colleague;
import com.zptioning.c20_mediator.colleague.Curtains;
import com.zptioning.c20_mediator.colleague.TV;

import java.util.HashMap;

;

public class ConcreteMediator implements Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {

        colleagueMap.put(colleagueName, colleague);


        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }

    }

    @Override
    public void GetMessage(int stateChange, String colleagueName) {


        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap
                        .get("CoffeeMachine")))).StartCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
            }

        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {

        }

    }

    @Override
    public void SendMessage() {


    }

}
