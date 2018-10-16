package com.ctc.mediator;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements  Party{

    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember member : members){
            if (!actor.equals(member)){
                member.partyAction(action);
            }
        }
    }

    @Override
    public List<PartyMember> getPartyMembers() {
        return members;
    }
}

