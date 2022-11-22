package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Pneumatics extends SubsystemBase {

Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
DoubleSolenoid pitchSolenoid;

boolean pressureSwitch;

  /** Creates a new Pneumatics. */
  public Pneumatics() {
    pitchSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,0,1);

}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    pressureSwitch =     pcmCompressor.getPressureSwitchValue();
    if (pressureSwitch) {
      pcmCompressor.disable();
    }
    else {
      pcmCompressor.enableDigital();
    }
  }
  public void initDefaultCommand(){

  }

  public void pitchup(){
    pitchSolenoid.set(kForward);

  }

  public void pitchdown(){
    pitchSolenoid.set(kReverse);
  }

  public void CompresorOn(){
    pcmCompressor.enableDigital();
  }
  public void CompressorOff(){
    pcmCompressor.disable();
  }
}
