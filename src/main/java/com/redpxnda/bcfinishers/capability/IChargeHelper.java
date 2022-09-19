package com.redpxnda.bcfinishers.capability;

import net.minecraft.world.entity.player.Player;

public interface IChargeHelper {
    double getCharge();
    void setCharge(double value);
    void incCharge(double value);
    void resetCharge();
}
