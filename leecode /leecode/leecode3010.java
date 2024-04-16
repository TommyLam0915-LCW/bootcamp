public class leecode3010 {
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4}; // 0-49

    // [1,2,3,12]
    // arr[1-1] -> arr[0]
    for (int i = 1; i < num.length; i++) {
      arr[num[i] - 1]++;
    }
    System.out.println(arr);
  }
  // public int minimumCost(int[] nums) {
    
  //   // min and secondMin.

  //   int[] arr = new int[]{1,2,3,4}; // 0-49

  //   // [1,2,3,12]
  //   // arr[1-1] -> arr[0]
  //   for (int i = 1; i < num.length; i++) {
  //     arr[num[i] - 1]++;
  //   }
  //   System.out.println(arr);
    // int count = 2;
    // int idx = 0;
    // int cost = 0;
    // while (count > 0) {
    //   if (arr[idx] > 0) {
    //     arr[idx]--;
    //     count--;
    //     cost += idx + 1;
    //   } else if (arr[idx] == 0) {
    //     idx++;
    //   }
    // }
    // return cost + num[0];
  }
