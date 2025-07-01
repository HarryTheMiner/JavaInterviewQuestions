package arrayRelatedQuestions;

public class RightRotationByN
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int k = 3;

        for(int i=0;i<k;i++)
        {
            int last = arr[arr.length-1];
            int j;
            for(j=arr.length-1;j>0;j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0]=last;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
