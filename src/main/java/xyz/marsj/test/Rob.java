package xyz.marsj.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sj
 * @create 2018/9/10
 */
public class Rob {
    static int memo[]=new int[100];
    public int dor(int nums[],int index){
        if(nums.length==index){
            return 0;
        }
        int res=0;
        if(memo[index]!=0){
            return memo[index];
        }
        for(int i=index;i<nums.length;i++){
            res= Math.max(res,nums[i]+dor(nums,i+2));
            memo[index]=res;
        }
        return memo[index];
    }
    public int doRob(int nums[]){
        return dor(nums,0);
    }
    public static void main(String[] args) {
        Rob rob=new Rob();
        int nums[]={2,7,9,3,1};
        int i = rob.doRob(nums);
        System.out.println(i);

    }
}
