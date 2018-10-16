package com.ctc.mediator;

public interface PartyMember {

    void joinParty(Party party);

    void partyAction(Action action);

    void act(Action action);
}

