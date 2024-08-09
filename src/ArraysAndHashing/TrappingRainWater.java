package ArraysAndHashing;

public class TrappingRainWater {

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));
//		trap(arr);

	}
	public static int trap(int[] height) {
        int localMin = 0;
        int n = height.length;
        int arr[] = new int[n];
        for(int i = 0 ; i< n; i++){
            int currentHeight = height[i];
            if(currentHeight > localMin){
                localMin = currentHeight;
            }
            else{
                arr[i] = localMin-currentHeight;
            }
        }
        int result = 0;
        localMin = 0;
        for(int i = n-1 ; i>=0 ; i--) {
        	int currentHeight= height[i];
        	int currentArrVal = arr[i];
        	if(currentHeight > localMin) {
        		localMin = currentHeight;
        		arr[i] = 0;
        	}
        	else {
        		arr[i] = localMin-currentHeight;
        	}
        	result = result + Math.min(arr[i], currentArrVal);
        }
//        for(int i : arr) {
//        	System.out.print(i+ "  ");
//        }
        return result;
    }
}
