package com.team5937.frc2018.auto.actions;

import com.team5937.frc2018.subsystems.Drive;

public class OverrideTrajectory extends RunOnceAction {
    @Override
    public void runOnce() {
        Drive.getInstance().overrideTrajectory(true);
    }
}
