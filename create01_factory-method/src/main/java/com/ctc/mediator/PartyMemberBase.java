package com.ctc.mediator;

public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinParty(Party party) {
        System.out.println(String.format("%s join the party", this));
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(String.format("%s %s", this, action.getDescribe()));
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(String.format("%s %s", this, action));
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}

