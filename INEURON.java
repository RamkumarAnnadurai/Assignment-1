class Print
{
    int j; //instance variable
    void display_I(int i, int n)
    {
        for(j=0;j<n;j++)
            {
                if(j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");    
            }
            System.out.print(" ");System.out.print(" ");
    }
    void display_N(int i, int n)
    {
        for(j=0;j<n;j++)
            {
                if(j==0||j==n-1||i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");System.out.print(" ");
    }
    void display_E(int i, int n)
    {
        for(j=0;j<n;j++)
            {
                if(j==0||i==n-1||i==0||i==n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");System.out.print(" ");
    }
    void display_U(int i, int n)
    {
        for(j=0;j<n;j++)
            {
                if(j==0&&i<n-1||i==n-1 && j>0 &&j<n-1||j==n-1&&i<n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");System.out.print(" ");
    }
    void display_R(int i, int n)
    {
        for(j=0;j<n;j++)
            {
                if(j==0||i==0 && j<n-1|| j==n-1 && i>0 && i<n/2 || i==n/2 && j<n-1 || i==j && i>n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");System.out.print(" ");
    }
    void display_O(int i, int n)
    {
        for(j=0;j<n;j++)
        {
            if(j==0&&i>0&&i<n-1||j==n-1 && i>0 &&i<n-1||i==0&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print(" ");System.out.print(" ");
    }
    
}
class Test {   
    public static void main(String[] args){   
        int i,j,n=7;
        for(i=0;i<n;System.out.println(),i++)
        {
            Print obj=new Print();  
            obj.display_I(i,n);
            obj.display_N(i,n);
            obj.display_E(i,n);
            obj.display_U(i,n);
            obj.display_R(i,n);
            obj.display_O(i,n);
            obj.display_N(i,n);
            
        }
    }
}