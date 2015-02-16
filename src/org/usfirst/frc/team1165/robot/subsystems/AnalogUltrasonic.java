package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.RobotMap;
import org.usfirst.frc.team1165.robot.commands.ReadUltrasonic;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AnalogUltrasonic extends Subsystem
{
	AnalogInput ultrasonic = new AnalogInput(RobotMap.ANALOGULTRASONIC);
	
	public double read()
	{
		return ultrasonic.getVoltage()/0.0098;
	}
	
	public double voltage()
	{
		return ultrasonic.getVoltage();
	}
	
	public double averageVoltage()
	{
		return ultrasonic.getAverageVoltage();
	}
	
	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new ReadUltrasonic());
	}
}
