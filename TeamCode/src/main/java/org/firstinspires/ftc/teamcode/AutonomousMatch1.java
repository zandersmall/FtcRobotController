
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Autonomous", group="Auto")
public class AutonomousMatch1 extends LinearOpMode {
    private ElapsedTime     runtime = new ElapsedTime();
    private DcMotor frontLeft;
    private DcMotor rearLeft;
    private DcMotor frontRight;
    private DcMotor rearRight;
    private CRServo shooterServo;
    private CRServo claw;
    private CRServo clawLift;
    private DcMotor shooter;

    @Override
    public void runOpMode() throws InterruptedException {
        shooter = hardwareMap.dcMotor.get("shooter");
        shooterServo = hardwareMap.crservo.get("shooterServo");
        claw = hardwareMap.crservo.get("claw");
        clawLift = hardwareMap.crservo.get("clawLift");
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        rearLeft = hardwareMap.dcMotor.get("rearLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        rearRight = hardwareMap.dcMotor.get("rearRight");

        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        rearLeft.setDirection(DcMotor.Direction.REVERSE);
        rearRight.setDirection(DcMotor.Direction.REVERSE);

        shooter.setDirection(DcMotor.Direction.FORWARD);
        shooter.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rearLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rearRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //rearLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //rearRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        //Initialize claw
        //clawLift.setPower(1);
        //sleep(3000);
        //claw.setPower(-1);
        //sleep(1500);

        //move forward 8 feet
        /*rearLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rearRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontLeft.setTargetPosition(1000);
        rearLeft.setTargetPosition(1000);
        frontRight.setTargetPosition(1000);
        rearRight.setTargetPosition(1000);*/
        shooterServo.setPower(-1);
        frontLeft.setPower(.5);
        rearLeft.setPower(.5);
        frontRight.setPower(.5);
        rearRight.setPower(.5);
        sleep(1900);
        frontLeft.setPower(.5);
        rearLeft.setPower(-.5);
        frontRight.setPower(-.5);
        rearRight.setPower(.5);
        sleep(800);
        frontLeft.setPower(0);
        rearLeft.setPower(0);
        frontRight.setPower(0);
        rearRight.setPower(0);
        shooter.setPower(-1);
        sleep(3000);
        shooter.setPower(-1);
        shooterServo.setPower(1);
        sleep(4000);
        shooterServo.setPower(-1);
        frontLeft.setPower(.5);
        rearLeft.setPower(-.5);
        frontRight.setPower(-.5);
        rearRight.setPower(.5);
        sleep(300);
        shooterServo.setPower(-1);
        frontLeft.setPower(0);
        rearLeft.setPower(0);
        frontRight.setPower(0);
        rearRight.setPower(0);
        shooter.setPower(-1);
        sleep(3000);
        shooter.setPower(-1);
        shooterServo.setPower(1);
        sleep(4000);
        //third ring
        shooterServo.setPower(-1);
        frontLeft.setPower(.5);
        rearLeft.setPower(.5);
        frontRight.setPower(-.5);
        rearRight.setPower(-.5);
        sleep(50);
        shooterServo.setPower(-1);
        frontLeft.setPower(0);
        rearLeft.setPower(0);
        frontRight.setPower(0);
        rearRight.setPower(0);
        shooter.setPower(-1);
        sleep(4000);
        shooter.setPower(-1);
        shooterServo.setPower(1);
        sleep(4000);
        //park
        frontLeft.setPower(-.5);
        rearLeft.setPower(-.5);
        frontRight.setPower(.5);
        rearRight.setPower(.5);
        sleep(50);
        frontLeft.setPower(.5);
        rearLeft.setPower(.5);
        frontRight.setPower(.5);
        rearRight.setPower(.5);
        sleep(500);
        frontLeft.setPower(0);
        rearLeft.setPower(0);
        frontRight.setPower(0);
        rearRight.setPower(0);
        shooterServo.setPower(-1);
        sleep(1000);
        /*rearLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rearRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        while (rearLeft.isBusy()&& rearRight.isBusy() && frontRight.isBusy()&&frontLeft.isBusy()&&opModeIsActive()) {
        }*/


    }



        //move forward 8 feet

}


    //move forward 8 feet

    //spin up shooter
    //flick servo
    //strafe left 8 inches
    //flick servo
    //strafe left 8 inches
    //flick servo
    //move forward 8 inches
    //stop



