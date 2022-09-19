package com.redpxnda.bcfinishers.capability;

import net.minecraft.world.entity.player.Player;

public class ChargeHelper implements IChargeHelper {

    private double charge;

    @Override
    public double getCharge() {
        return this.charge;
    }

    @Override
    public void setCharge(double value) {
        this.charge = value;
    }

    @Override
    public void incCharge(double value) {
        this.charge = this.charge += value;
    }

    @Override
    public void resetCharge() {
        this.charge = 0;
    }
}
