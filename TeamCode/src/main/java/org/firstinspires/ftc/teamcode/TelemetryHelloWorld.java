package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class TelemetryHelloWorld extends OpMode {
    @Override
    public void init() {

        telemetry.addData("Hello","World");

    }

    @Override
    public void loop() {

    }
}

// In wrong branch, 1st lesson, just send telemetry data.