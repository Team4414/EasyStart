
/**
   * Imports: these are imports from the vender libraries that you should have installed
   * You generally don't have to worry about these; VS code will will them in for you
   * In the case that VS code doesn't import automatically, you can hover over the word and click 
   * "quick fix", which will give you the choice to import manually. 
   */
package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;


public class Robot extends TimedRobot {
/**
   * Declaration: we are letting the program know that there will be an object of type TalonFX 
   * and that we're naming it "newTalon" (it can be named anything you want). 
   * The TalonFX is a type of speed controller for the robot motors. 
   */

  TalonFX newTalon; 


  @Override
  public void robotInit() {

    newTalon = new TalonFX(0);

  /**
   * Instantiation: the "new" keywork lets the program know that memory is being allocated for our new object
   * The 0 in the parenthesis is the ID number of the motor (we could put any valid ID number and control different 
   * motors)
   */


  

  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
      newTalon.set(ControlMode.PercentOutput, 30); 
  /**
   * In teletopInit (when we turn on the teleop mode on Driver Station), we are setting the power of the motor "newTalon"
   * We are using control mode (percent output), and 30 is our output value 
   */
  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {
    newTalon.set(ControlMode.PercentOutput, 0); 
  /**
   * In disabledPeriodic, we are setting the output value of the motor to 0 periodically. 
   */
    
  }

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
