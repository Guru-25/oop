class Triangle {
    public static void main(String args[]) {
        int n=5, t=-1;
        for(int i=1;i<=n;i++) {
            t=t+2;
            for(int j=1;j<=t;j++) {
                if(j==1 || j==t)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}