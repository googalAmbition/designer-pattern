package com.ctc.mediator;

import java.util.List;

public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);

    List<PartyMember> getPartyMembers();
}

