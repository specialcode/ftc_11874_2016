package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.math.AdvancedBot;

/**
 * Created by Ethan Tucker on 1/21/2017.
 */
@Autonomous(name = "11874: Fire Autonomous Do not Move", group = "11874")
public class AutonFireAndSit extends LinearOpMode {

    AdvancedBot bot;

    @Override
    public void runOpMode() throws InterruptedException {
        bot = new AdvancedBot(this);
        bot.setDriveMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        idle();
        //bot.calibrateGyro();
        bot.setDriveMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();


        bot.thrower.setPosition(0.0);
        bot.sleep(500);
    }

}
