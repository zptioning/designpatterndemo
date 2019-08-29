package com.zptioning.behaviour_style.e20_mediator.mediator;

import com.zptioning.behaviour_style.e20_mediator.colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {

    private List<Colleague> mColleagueList = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!mColleagueList.contains(colleague)) {
            mColleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague, String message) {
        for (Colleague tempColleague : mColleagueList) {
            if (!tempColleague.equals(colleague)) {
                tempColleague.receive(message);
            }
        }
    }
}
