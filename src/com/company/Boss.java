package com.company;

public class Boss extends GameEntity{
    Weapon w1 = new Weapon();


    public Weapon getW1() {
        return w1;
    }

    public void setW1(Weapon w1) {
        this.w1 = w1;
    }
    public String printInfo(){
        return health + " " + damage;
    }
}
