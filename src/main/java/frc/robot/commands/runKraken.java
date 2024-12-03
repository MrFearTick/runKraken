// Version 1

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Kraken;

public class runKraken extends Command {
  Kraken m_kraken;
  double m_speed;

  public runKraken(Kraken kraken, double speed) {
    this.m_kraken = kraken;
    this.m_speed = speed;
    addRequirements(m_kraken);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    m_kraken.runKraken(m_speed);
  }

  @Override
  public void end(boolean interrupted) {
    m_kraken.runKraken(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
