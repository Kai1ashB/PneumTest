package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;

import frc.robot.Robot;

public class Pneumatics1 extends InstantCommand {
public Pneumatics1() {
addRequirements(Robot.m_Pneumatics);
}

  // Called when the command is initially scheduled.

@Override

public void initialize() {
   Robot.m_Pneumatics.pitchup();
}

}
