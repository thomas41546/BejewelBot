// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   thread1.java


public class thread1 extends Bejeweled
{

    public thread1()
    {
    }

    public static void scan()
        throws Exception
    {
        int color = 0;
        int blank = 0;
        for(int j = 0; j < 8; j++)
        {
            for(int i = 0; i < 8; i++)
            {
                color = snapshot.getpixcolor(40 * i, 280 - 40 * j);
                if(color == 0x1f1f20 || color == 0x171718 || color == 0x5e2c6 || color == 0x2e2e2f)
                    grid[i][j] = 1;
                else
                if(color == 0x6e5ca || color == 0x5e2c8 || color == 43136 || color == 0x5eedf)
                    grid[i][j] = 2;
                else
                if(color == 0x199adf || color == 0x1894db || color == 17018 || color == 0x138ad8)
                    grid[i][j] = 3;
                else
                if(color == 0x10add || color == 2523 || color == 0x456ede || color == 0xc1100 || color == 117)
                    grid[i][j] = 4;
                else
                if(color == 0x10f011 || color == 0xfed10 || color == 41985 || color == 0x27ed29 || color == 0x33ee35)
                    grid[i][j] = 5;
                else
                if(color == 0xef7402 || color == 0xec7401 || color == 0 || color == 0xd46606)
                    grid[i][j] = 6;
                else
                if(color == 0xef5bdf || color == 0xea58da || color == 0xff3ef4 || color == 0xb61389 || color == 0xff49f4)
                {
                    grid[i][j] = 7;
                } else
                {
                    blank++;
                    grid[i][j] = color + blank;
                }
            }

        }

        if(blank > 60 && System.currentTimeMillis() - starttime > 0x14c08L)
            scan();
    }
}
