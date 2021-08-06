package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase{

    private static DriveSubsystem instance;
    public static DriveSubsystem getInstance(){
        if (instance == null)
            instance = new DriveSubsystem();
        return instance;
    }

    TalonFX motor3;
    TalonFX motor4;
    TalonFX motor5;
    TalonFX motor6;

    private DriveSubsystem(){
        motor3 = new TalonFX(5);
        motor4 = new TalonFX(3);
        motor5 = new TalonFX(6);
        motor6 = new TalonFX(4);
    }

    public void runMotor(double power) {
        motor3.set(ControlMode.PercentOutput, power);
        motor4.set(ControlMode.PercentOutput, power);
        motor5.set(ControlMode.PercentOutput, power);
        motor6.set(ControlMode.PercentOutput, power);
    }
    
}
