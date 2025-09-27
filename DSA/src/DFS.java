public class DFS {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        int n = mat.length,count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                count=+1;
                func(i,j,mat,n);
            }
        }
        System.out.println(count);
    }
    private static void func(int i,int j,int[][] mat,int n)
    {
        if(i<0 || i>=n || j<0 || j>=n || mat[i][j]==0)
            return;
        mat[i][j]=0;

        func(i+1,j,mat,n);
        func(i-1,j,mat,n);
        func(i,j+1,mat,n);
        func(i,j-1,mat,n);

    }
}
