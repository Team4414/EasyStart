// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {


  TalonFX newTalon; 
  /**
   * Declaration: we are letting the program know that there will be an object of type TalonFX 
   * and that we're naming it "newTalon" (it can be named anything you want)
   */

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
