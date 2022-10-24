class Test {   
    public static void main(String[] args){  
        int i,j,n=15; 
        for(i=0;i<n;System.out.println(),i++)
        {
            for(j=0;j<n;j++)
            {
                if(i-j>=n/2 || i+j>=(n-1)+(n/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
    }
}