package com.team5937.frc2018.auto.modes;

import com.team5937.frc2018.auto.AutoModeBase;
import com.team5937.frc2018.auto.AutoModeEndedException;

public class DoNothingMode extends AutoModeBase {
    @Override
    protected void routine() throws AutoModeEndedException {
        System.out.println("Doing nothing");
    }
}
