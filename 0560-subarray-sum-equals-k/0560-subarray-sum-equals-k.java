public class Solution {

   
    public static int subarraySum(int[] arr, int target) {  
        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int num : arr) {
            prefixSum = prefixSum + num;  

           
            if (map.containsKey(prefixSum - target)) {
                count = count + map.get(prefixSum - target); 
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target value ");
        int target = sc.nextInt();

        printArray(arr);
        int ans = subarraySum(arr, target);
        System.out.println(ans);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
