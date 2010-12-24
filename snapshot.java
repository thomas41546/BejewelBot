// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   snapshot.java

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class snapshot extends Bejeweled
{

    public snapshot()
    {
    }

    static int getpixcolor(int x, int y)
        throws IOException, AWTException
    {
        java.awt.image.RenderedImage image = (new Robot()).createScreenCapture(screenRect);
        return -((BufferedImage)image).getRGB(x, y);
    }

    static Rectangle screenRect;

    static 
    {
        screenRect = new Rectangle(x, y - 280, 320, 320);
    }
}
