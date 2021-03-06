package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.hardware.HardwareBot;
import org.firstinspires.ftc.teamcode.math.AdvancedBot;

/**
 * Created by Ethan Tucker on 2/2/2017.
 */
@TeleOp(name = "11874: LineFollowTest", group = "11874")
public class BotTestLineFollowOp extends LinearOpMode {

    AdvancedBot bot;

    @Override
    public void runOpMode() throws InterruptedException {
        bot = new AdvancedBot(this);
        bot.setDriveMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        idle();
        //bot.calibrateGyro();
        bot.setDriveMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        while(!gamepad1.a && opModeIsActive()) {
            /*if(bot.lineSensorLeft.getLightDetected() > AdvancedBot.LINE_THRESHOLD) {
                bot.leftMotor.setPower(0.01);
                bot.rightMotor.setPower(0.07);
            } else if(bot.lineSensorRight.getLightDetected() > AdvancedBot.LINE_THRESHOLD) {
                bot.leftMotor.setPower(0.07);
                bot.rightMotor.setPower(0.01);
            } else {
                bot.leftMotor.setPower(0.04);
                bot.rightMotor.setPower(0.04);
            }*/

            telemetry.addData("Left Motor", bot.leftMotor.getPower());
            telemetry.addData("Right Motor", bot.rightMotor.getPower());
            telemetry.addData("Left Light", bot.lineSensorLeft.getLightDetected());
            telemetry.addData("Right Light", bot.lineSensorRight.getLightDetected());
            telemetry.update();
        }
    }

}