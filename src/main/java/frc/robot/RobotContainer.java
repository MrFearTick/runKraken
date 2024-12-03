// Version 1

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.runKraken;
import frc.robot.subsystems.Kraken;

public class RobotContainer {
  Joystick ps5 = new Joystick(0);
  Kraken kraken = new Kraken();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(ps5, 1).whileTrue(new runKraken(kraken, 1));
    new JoystickButton(ps5, 2).whileTrue(new runKraken(kraken, -1));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}