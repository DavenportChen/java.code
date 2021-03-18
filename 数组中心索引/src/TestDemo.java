/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-02-20
 * Time: 23:50
 */
public class TestDemo {
    class Solution {
        public int pivotIndex(int[] nums) {
            if(nums.length == 1)return 0;
            if(nums.length == 0)return -1;
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
            }
            if(sum == 0)return 0;
            int i = 1;
            while(i < nums.length){
                int  sum1 = 0;
                for(int j = i-1; j <= 0; j++){
                    sum1 += nums[j];
                }
                int sum2 = 0;
                for(int j = i+1; j < nums.length; j++ ){
                    sum2 += nums[j];
                }
                if(sum1 == sum2){
                    return i;
                }else{
                    i++;
                }
            }
            return -1;
        }
    }
}
