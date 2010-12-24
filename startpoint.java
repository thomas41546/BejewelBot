// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   startpoint.java

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintStream;

public class startpoint extends Bejeweled
{

    public startpoint()
    {
    }

    static void findorgin()
        throws IOException, AWTException
    {
        java.awt.image.RenderedImage image = (new Robot()).createScreenCapture(cali);
        boolean found = false;
        for(int i = 0; i < 900 && !found; i++)
        {
            for(int j = 0; j < 900 && !found; j++)
            {
                int TL = -((BufferedImage)image).getRGB(i, j);
                if(TL == 0x1f1f20 || TL == 0xef7402 || TL == 0xef5bdf || TL == 0x199adf || TL == 0x10add || TL == 0x10f011)
                {
                    TL = -((BufferedImage)image).getRGB(i, j + 40);
                    if(TL == 0x1f1f20 || TL == 0xef7402 || TL == 0xef5bdf || TL == 0x199adf || TL == 0x10add || TL == 0x10f011)
                    {
                        TL = -((BufferedImage)image).getRGB(i + 80, j + 80);
                        if(TL == 0x1f1f20 || TL == 0xef7402 || TL == 0xef5bdf || TL == 0x199adf || TL == 0x10add || TL == 0x10f011)
                        {
                            System.out.println((new StringBuilder("x=")).append(i).append(", y=").append(j + 280).toString());
                            found = true;
                        }
                    }
                }
            }

        }

    }

    static Rectangle cali = new Rectangle(0, 0, 950, 950);

}
