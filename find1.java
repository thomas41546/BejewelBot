// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   find1.java

import java.awt.Robot;

public class find1 extends Bejeweled
{

    public find1()
    {
    }

    public static void findThem()
        throws Exception
    {
        Robot r = new Robot();
        for(int j = 0; j < 8; j++)
        {
            for(int i = 0; i < 8; i++)
            {
                if(i + 0 < 8 && j + 3 < 8 && grid[i + 0][j + 0] == grid[i + 0][j + 1] && grid[i + 0][j + 1] == grid[i + 0][j + 3])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 3));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 2));
                    r.mouseRelease(16);
                }
                if(i + 1 < 8 && j + 2 < 8 && grid[i + 0][j + 0] == grid[i + 0][j + 1] && grid[i + 0][j + 1] == grid[i + 1][j + 2])
                {
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 2));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 2));
                    r.mouseRelease(16);
                }
                if(i + 1 < 8 && j + 2 < 8 && grid[i + 0][j + 0] == grid[i + 0][j + 2] && grid[i + 0][j + 2] == grid[i + 1][j + 1])
                {
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 1));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 1));
                    r.mouseRelease(16);
                }
                if(i + 1 < 8 && j + 2 < 8 && grid[i + 1][j + 0] == grid[i + 0][j + 1] && grid[i + 0][j + 1] == grid[i + 0][j + 2])
                {
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 0));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 0));
                    r.mouseRelease(16);
                }
                if(i + 0 < 8 && j + 3 < 8 && grid[i + 0][j + 0] == grid[i + 0][j + 2] && grid[i + 0][j + 2] == grid[i + 0][j + 3])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 0));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 1));
                    r.mouseRelease(16);
                }
                if(i + 1 < 8 && j + 2 < 8 && grid[i + 0][j + 2] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 1][j + 0])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 2));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 2));
                    r.mouseRelease(16);
                }
                if(i + 1 < 8 && j + 2 < 8 && grid[i + 0][j + 1] == grid[i + 1][j + 0] && grid[i + 1][j + 0] == grid[i + 1][j + 2])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 1));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 1));
                    r.mouseRelease(16);
                }
                if(i + 1 < 8 && j + 2 < 8 && grid[i + 0][j + 0] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 1][j + 2])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 0));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 0));
                    r.mouseRelease(16);
                }
                if(i < 5 && grid[i][j] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 3][j])
                {
                    r.mouseMove(x + 40 * (i + 3), y - 40 * j);
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 2), y - 40 * j);
                    r.mouseRelease(16);
                }
                if(i + 2 < 8 && j + 1 < 8 && grid[i + 1][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 0][j + 1])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 1));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 0));
                    r.mouseRelease(16);
                }
                if(i + 2 < 8 && j + 1 < 8 && grid[i + 0][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 1][j + 1])
                {
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 1));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 0));
                    r.mouseRelease(16);
                }
                if(i + 3 < 8 && j + 1 < 8 && grid[i + 0][j] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 2][j + 1])
                {
                    r.mouseMove(x + 40 * (i + 2), y - 40 * (j + 1));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 2), y - 40 * (j + 0));
                    r.mouseRelease(16);
                }
                if(i < 6 && grid[i][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 3][j])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * j);
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 1), y - 40 * j);
                    r.mouseRelease(16);
                }
                if(i + 2 < 8 && j + 1 < 8 && grid[i + 0][j] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 2][j + 1])
                {
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 0));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 0), y - 40 * (j + 1));
                    r.mouseRelease(16);
                }
                if(i + 2 < 8 && j + 1 < 8 && grid[i + 0][j + 1] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 2][j + 1])
                {
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 0));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 1), y - 40 * (j + 1));
                    r.mouseRelease(16);
                }
                if(i + 2 < 8 && j + 1 < 8 && grid[i + 0][j + 1] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 2][j + 0])
                {
                    r.mouseMove(x + 40 * (i + 2), y - 40 * (j + 0));
                    r.mousePress(16);
                    r.mouseMove(x + 40 * (i + 2), y - 40 * (j + 1));
                    r.mouseRelease(16);
                }
            }

        }

    }
}
