/*In the 8X8 chess board, taking only knight into consideration, if we start the knight from any square of the chessboard, the aim is to cover max number of square , without repeating any square . so far I have found the most efficient solution with my code below is:

60    29    34    49    0    15    46    0

35    50    1    16    45    48    11    0

30    59    28    33    2    9    14    47

51    36    31    44    17    12    3    10

58    43    52    27    32    25    8    13

37    40    55    18    23    6    21    4

42    57    38    53    26    19    24    7

39    54    41    56    0    22    5    20
Where the number starting with 1, shows the path followed by knight. My question is can this code be corrected for a perfect answer which is 64 (mine reaches only 60)?*/

import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Knight {
static int board[][]=new int[8][8];
static int value=1;
public static void zero()
{
    for(int i=0;i<7;i++)
        for(int j=0;j<7;j++)
            board[i][j]=0;
}

public static void knightpos(int x,int y)throws IOException
{
    if(value==61)
    {   System.out.println();
    for(int i=0;i<8;i++)
    {
        System.out.println();
        System.out.println();
        for(int j=0;j<8;j++)
        System.out.print("    "+board[i][j]);
    }

        System.exit(0);
    }


    if(x+1<=7&&y+2<=7)
    {
        if(board[x+1][y+2]==0)
        {  board[x+1][y+2]=value++;
           knightpos(x+1,y+2);
        }
    }

    if(x+2<=7&&y+1<=7)
    {
         if(board[x+2][y+1]==0)
        {
           board[x+2][y+1]=value++;
           knightpos(x+2,y+1);
        }
    }

    if(x-2>=0&&y-1>=0)
    {
        if(board[x-2][y-1]==0)
        {board[x-2][y-1]=value++;
           knightpos(x-2,y-1);
        }
    }

    if(x+2<=7&&y-1>=0)
    {
          if(board[x+2][y-1]==0)
        {board[x+2][y-1]=value++;
           knightpos(x+2,y-1);
        }
    }

    if(x+1<=7&&y-2>=0)
    {
        if(board[x+1][y-2]==0)
        {board[x+1][y-2]=value++;
           knightpos(x+1,y-2);}
    }

    if(x-1>=0&&y-2>=0)
    {
          if(board[x-1][y-2]==0)
        {board[x-1][y-2]=value++;
           knightpos(x-1,y-2);}
    }

    if(x-2>=0&&y+1<=7)
    {
          if(board[x-2][y+1]==0)
        {board[x-2][y+1]=value++;
           knightpos(x-2,y+1);}
    }

    if(x-1>=0&&y+2<=7)
    {
          if(board[x-1][y+2]==0)
        {board[x-1][y+2]=value++;
           knightpos(x-1,y+2);}
    }
    board[x][y]=0;
    value--;
    return;
}

public static boolean chk() {

    for(int i=0;i<7;i++)
        for(int j=0;j<7;j++)
            if(board[i][j]==0)
                return false;

    return true;

}


public static void main(String args[])throws IOException
{
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);
    System.out.println("Knight chess game input x,y position ");
    int x=Integer.parseInt(br.readLine());
    int y=Integer.parseInt(br.readLine());
{
    if(!chk())
            {   
                zero();
                value=1;
                knightpos(x,y);
            }

}           
}
}
