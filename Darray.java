public class Darray {
    public static void main(String[] args)
     {
        int h2=(int)(Math.random()*10);
        int h1=(int)(Math.random()*10);
        int  a[][]=new int[h1][h2];
        
     
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                 a[i][j]=(int)(Math.random()*100);
                
            }
           
        }
        for(int n[]:a)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
     


            
     }

}

