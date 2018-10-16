package com.ctc.facade;

public class Facade {

    private Outpatient outpatient;

    private Registration registration;

    private Pay pay;

    private Medicine medicine;

    public Facade(){
        outpatient = new Outpatient();
        registration = new Registration();
        pay = new Pay();
        medicine = new Medicine();
    }

    public void ent(){
        registration.ent();
        outpatient.ent();
        pay.payFees();
        medicine.getMedicine();
    }

    public void dermatology(){
        registration.dermatology();
        outpatient.dermatology();;
        pay.payFees();
        medicine.getMedicine();
    }
}

