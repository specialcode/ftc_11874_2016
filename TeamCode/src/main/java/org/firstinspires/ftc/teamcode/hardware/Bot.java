package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Ethan Tucker on 10/25/2016.
 */
public class Bot {

    private HardwareMap hardwareMap;

    private DcMotor leftMotor;
    private DcMotor rightMotor;

    private GyroSensor gyro;

    public Bot(HardwareMap map) {
        this.hardwareMap = map;
        this.leftMotor = map.dcMotor.get("motor_left");
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        this.rightMotor = map.dcMotor.get("motor_right");

        this.gyro = map.gyroSensor.get("gyro");
    }

    public DcMotor getLeftMotor() {
        return leftMotor;
    }

    public void setLeftMotor(DcMotor leftMotor) {
        this.leftMotor = leftMotor;
    }

    public DcMotor getRightMotor() {
        return rightMotor;
    }

    public void setRightMotor(DcMotor rightMotor) {
        this.rightMotor = rightMotor;
    }

    public GyroSensor getGyro() {
        return gyro;
    }

    public void setGyro(GyroSensor gyro) {
        this.gyro = gyro;
    }
}
