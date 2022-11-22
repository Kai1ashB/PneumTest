package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Pneumatics1;
import frc.robot.commands.Pneumatics2;
import frc.robot.subsystems.Pneumatics;


public class RobotContainer {
  //Instances our joysticks
  private XboxController xboxController = new XboxController(0);
  // The robot's subsystems and commands are defined here...
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
//pneumatics
   if(xboxController.getAButtonPressed()){
     new Pneumatics1();
   }
   if(xboxController.getBButtonPressed()){
     new Pneumatics2();
   }

  }
}