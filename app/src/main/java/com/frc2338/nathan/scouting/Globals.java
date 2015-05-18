package com.frc2338.nathan.scouting;

/**
 Created by Nathan on 2/15/2015.
 Contains all persisting variables, and some often used methods
 */
public class Globals {
    public static String username = "Scouting", SMS = "nothing", phoneNumber = null;
    public static boolean addsub = true, autoStack = false, mobility = false, coopStack = false,
            coopWrecked = false, grabTele = false, grabAuto = false, affirmative = true,
            scoutText = true, textFailed = false;
    public static int teamNumber, matchNumber = 1, tote1 = 0, tote2 = 0, tote3 = 0, tote4 = 0,
            tote5 = 0,tote6 = 0, can1 = 0, can2 = 0, can3 = 0, can4 = 0, can5 = 0, can6 = 0,
            noodle = 0, autoTote = 0, autoCan = 0, wreckedStack = 0, thrownLitter = 0,
            processedLitter = 0, totalScore = 0, alertMode = 0;
    public void saveSMS(){
        if (Globals.coopWrecked) {
            Globals.wreckedStack++;
        }
        Globals.SMS = (Integer.toString(Globals.teamNumber));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.matchNumber));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + ('0');
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.autoTote));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + ('0');
        Globals.SMS = Globals.SMS + (',');
        if (Globals.autoStack) {
            Globals.SMS = Globals.SMS + ('1');
        } else {
            Globals.SMS = Globals.SMS + ('0');
        }
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + ('0');
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.autoCan));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + ('0');
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.tote1));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.tote2));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.tote3));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.tote4));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.tote5));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.tote6));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + ('0');
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.can1));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.can2));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.can3));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.can4));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.can5));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.can6));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.noodle));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.wreckedStack));
        Globals.SMS = Globals.SMS + (',');
        if (Globals.mobility) {
            Globals.SMS = Globals.SMS + ('1');
        } else {
            Globals.SMS = Globals.SMS + ('0');
        }
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.processedLitter));
        Globals.SMS = Globals.SMS + (',');
        Globals.SMS = Globals.SMS + (Integer.toString(Globals.thrownLitter));
        Globals.SMS = Globals.SMS + (',');
        if (Globals.coopStack) {
            Globals.SMS = Globals.SMS + ('1');
        } else {
            Globals.SMS = Globals.SMS + ('0');
        }
        Globals.SMS = Globals.SMS + (',');
        if (Globals.coopWrecked) {
            Globals.SMS = Globals.SMS + ('1');
        } else {
            Globals.SMS = Globals.SMS + ('0');
        }
        Globals.SMS = Globals.SMS + (',');
        if (Globals.grabAuto) {
            Globals.SMS = Globals.SMS + ('1');
        } else {
            Globals.SMS = Globals.SMS + ('0');
        }
        Globals.SMS = Globals.SMS + (',');
        if (Globals.grabTele) {
            Globals.SMS = Globals.SMS + ('1');
        } else {
            Globals.SMS = Globals.SMS + ('0');
        }
        Globals.SMS = Globals.SMS + ("\r\n");
    }
    public void allZero(){
        Globals.teamNumber = 0;
        Globals.tote1 = 0;
        Globals.tote2 = 0;
        Globals.tote3 = 0;
        Globals.tote4 = 0;
        Globals.tote5 = 0;
        Globals.tote6 = 0;
        Globals.can1 = 0;
        Globals.can2 = 0;
        Globals.can3 = 0;
        Globals.can4 = 0;
        Globals.can5 = 0;
        Globals.can6 = 0;
        Globals.noodle = 0;
        Globals.autoTote = 0;
        Globals.autoCan = 0;
        Globals.wreckedStack = 0;
        Globals.processedLitter = 0;
        Globals.thrownLitter = 0;
        Globals.addsub = true;
        Globals.autoStack = false;
        Globals.mobility = false;
        Globals.coopStack = false;
        Globals.coopWrecked = false;
        Globals.grabTele = false;
        Globals.grabAuto = false;
    }

}
