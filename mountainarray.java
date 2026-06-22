package javaapplication52;

public class mountainarray {
    public static void main(String[] args) {
        mountainarray j=new mountainarray();
        int ar[]={0,2,3,4,5,2,1,0};
       boolean h=j.mount(ar);
        System.out.println(h);
    }
    public boolean mount(int arr[])
    {
        int n=arr.length;
        
        if(n<3)
        {
            return false;
        }
        int i = 0;
        
        while(i+1<n&&arr[i]<arr[i+1])
        {
            i++;
        }
        if(i==0&&i==n-1)
        {
            return false;
        }
      
        while(i+1<n&&arr[i]>arr[i+1])
        {   
            i++;
        }
        return i==n-1;
    }
}