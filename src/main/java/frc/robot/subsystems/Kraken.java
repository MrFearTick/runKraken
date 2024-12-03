// Version 1

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Kraken extends SubsystemBase {
  TalonFX motor1 = new TalonFX(1);
  public Kraken() {}

  public void runKraken(double speed) {
    motor1.set(speed);
  }

  @Override
  public void periodic() {}
}
