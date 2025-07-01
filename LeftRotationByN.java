package arrayRelatedQuestions;

public class LeftRotationByN
{
    public static void main(String[] args)
    {
        int arr[]= {1,2,3,4,5};
        int r = 3;
        for(int i=0;i<r;i++)
        {
            int first  = arr[0];int j;

            for(j=0;j<arr.length-1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
