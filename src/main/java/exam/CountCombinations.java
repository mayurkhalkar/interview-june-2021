package exam;

public class CountCombinations {

  
   static int count=0;
static void printVector(ArrayList<Integer> arr)
{
    if (arr.size() != 1)
    {
        count++;
    }
}
  static void findWays(ArrayList<Integer> arr, int i, int n,int k)
{
    if (n == 0)
       printVector(arr);
    for(int j = i; j <= n && j<=k; j++)
    {
        arr.add(j);
        findWays(arr, j, n - j,k);
        arr.remove(arr.size() - 1);
    }
}
  public int getNumberOfWays(final int total, final int k) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    findWays(arr, 1, total,k);
    return count;
  }
  }

}
