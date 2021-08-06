package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class MyCommand extends CommandBase{
    Timer myTimer;

    public MyCommand () {
        myTimer = new Timer();

    }
    @Override
    public void initialize() {
        DriveSubsystem.getInstance().runMotor(0.2);
        myTimer.reset();
        myTimer.start();
    }
    @Override
    public void execute() {
        
    }
    
    @Override
    public boolean isFinished() {
      if (myTimer.hasElapsed(2)){
        return true;
      }  
     return false;
    }

    @Override
    public void end(boolean interrupted) {
        DriveSubsystem.getInstance().runMotor(0);
    }
}