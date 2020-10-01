// #1041 Robot_Bounded_In_Circle
// Java
// pratik ghule

class Solution {
    public boolean isRobotBounded(String inst) {
        
        
        char face = 'N';
        int n = inst.length();
        int x =0 , y = 0;
        int loop = 0;
        while(loop < 100 || (x==0 & y==0))
        {
            for(int i=0;i<n;i++)
            {
                if(inst.charAt(i) == 'G')
                {
                    if(face == 'E')
                    {
                        x++;
                    }
                    else if(face == 'W')
                    {
                        x--;
                    }
                    else if(face == 'N')
                    {
                        y++;
                    }
                    else
                    {
                        y--;
                    }
                }
                else if(inst.charAt(i) == 'L')
                {
                    if(face == 'E')
                    {
                        face = 'N';
                    }
                    else if(face == 'W')
                    {
                        face = 'S';
                    }
                    else if(face == 'N')
                    {
                        face = 'W';
                    }
                    else
                    {
                        face = 'E';
                    }
                }
                else if(inst.charAt(i) == 'R')
                {
                    if(face == 'E')
                    {
                        face = 'S';
                    }
                    else if(face == 'W')
                    {
                        face = 'N';
                    }
                    else if(face == 'N')
                    {
                        face = 'E';
                    }
                    else
                    {
                        face = 'W';
                    }
                }
            }
            loop++;
            if(x==0 && y==0)
                return true;
            
        }
        if(x==0 && y==0)
                return true;
            else
                return false;   
    }
}
