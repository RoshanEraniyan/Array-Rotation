import java.util.*;
class Solution{
    public void rotation(int size,int[] array,int k)
    {
        int[] rotated=new int[size];
        if(k>size) {
            k %= size;
        }

        int j=0;
        for(int i=size-k;i<size;i++)
        {
                rotated[j]=array[i];
                j+=1;
        }
        for(int i=0;i<=size-k-1;i++)
        {
            rotated[j]=array[i];
            j+=1;
        }
        for(int element:rotated)
        {
            System.out.print(element+" ");
        }
    }
}
public class RotationalArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        int b= scanner.nextInt();
        Solution solution=new Solution();
        solution.rotation(n,array,b);

    }
}

