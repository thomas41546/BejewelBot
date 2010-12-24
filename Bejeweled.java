// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Bejeweled.java

import java.awt.Robot;
import java.io.PrintStream;

public class Bejeweled
{

    public Bejeweled()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        Robot r = new Robot();
        Thread.sleep(5000L);
        if(calibrate)
            startpoint.findorgin();
        r.mouseMove(x, y);
        do
        {
            if(System.currentTimeMillis() - starttime > 0x14c08L)
                break;
            thread1.scan();
            if(calibrate)
                break;
            find1.findThem();
            Thread.sleep(225L);
        } while(true);
        System.out.println();
        for(int j = 7; j > -1; j--)
        {
            for(int i = 0; i < 8; i++)
            {
                System.out.print(grid[i][j]);
                System.out.print("; ");
            }

            System.out.println();
        }

    }

    static final int red = 0x6e5ca;
    static final int redfire = 0x5e2c8;
    static final int redSpark = 43136;
    static final int redMulti = 0x5eedf;
    static final int blue = 0xef7402;
    static final int bluefire = 0xec7401;
    static final int blueSpark = 0;
    static final int blueMulti = 0xd46606;
    static final int green = 0xef5bdf;
    static final int greenfire = 0xea58da;
    static final int greenSpark = 0xb61389;
    static final int greenMulti2 = 0xff3ef4;
    static final int greenMulti3 = 0xff49f4;
    static final int white = 0x1f1f20;
    static final int whitefire = 0x171718;
    static final int whiteSpark = 0x5e2c6;
    static final int whiteMulti = 0x2e2e2f;
    static final int orange = 0x199adf;
    static final int orangefire = 0x1894db;
    static final int orangeSpark = 17018;
    static final int orangeMulti = 0x138ad8;
    static final int yellow = 0x10add;
    static final int yellowfire = 2523;
    static final int yellowcoin = 0x456ede;
    static final int yellowSpark = 117;
    static final int yellowMulit = 0xc1100;
    static final int purple = 0x10f011;
    static final int purplefire = 0xfed10;
    static final int purpleSpark = 41985;
    static final int purpleMulti2 = 0x27ed29;
    static final int purpleMulti3 = 0x33ee35;
    public static int grid[][] = new int[9][9];
    static final int s = 40;
    static long starttime = System.currentTimeMillis();
    public static int x = 667;
    public static int y = 647;
    public static boolean calibrate = false;

}
