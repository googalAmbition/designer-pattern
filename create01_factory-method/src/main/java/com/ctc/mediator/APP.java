package com.ctc.mediator;

import org.junit.Test;

public class APP {

    @Test
    public void mediatorTest(){
        Party party = new PartyImpl();

        PartyMember hobbit = new Hobbit();
        PartyMember hunter = new Hunter();
        PartyMember wizard = new Wizard();

        party.addMember(hobbit);
        party.addMember(hunter);
        party.addMember(wizard);

        for (PartyMember member: party.getPartyMembers()){
            System.out.println(String.format("%s",member));
        }

        System.out.println("===act===");
        hobbit.act(Action.GOLD);
        System.out.println("======");
        hunter.act(Action.HUNT);
        System.out.println("======");
        wizard.act(Action.TALE);

    }
}

