package com.ctc.visitor;



public interface UnitVisitor {

    void visitSolder(Soldier soldier);
    void visitSergeant(Sergeant sergeant);
    void visitCommander(Commander commander);

}

