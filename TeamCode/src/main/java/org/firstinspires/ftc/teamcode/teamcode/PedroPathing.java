package org.firstinspires.ftc.teamcode.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.mechanisms.MecanumDrive;

@TeleOp
public class PedroPathing extends OpMode {
    MecanumDrive driver = new MecanumDrive();

    public void init() {driver.init(hardwareMap); }

    @Override
    public void loop() {
        driver.drive(0, 1, 0);

    }
}
