// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

 
/** Add your docs here. */
public class speedSPEED extends Subsystem{
    public Joystick stickOfJoy = new Joystick(5);

    public PWMSparkMax leftMotor = new PWMSparkMax(0);
    public PWMSparkMax leftMotor2 = new PWMSparkMax(1);
    public PWMSparkMax rightMotor = new PWMSparkMax(2);
    public PWMSparkMax rightMotor2 = new PWMSparkMax(3);

    SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftMotor, leftMotor2);
    SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightMotor, rightMotor2);

    public DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

    public speedSPEED() {}

    public void lucio(double move, double turn){
        drive.arcadeDrive(move, turn);
        drive.setSafetyEnabled(false);
        if (move > .5) move = .5; 
    }
     @Override 
     public void initDefaultCommand() {
     }
}
