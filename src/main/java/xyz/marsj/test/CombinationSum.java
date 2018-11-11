package xyz.marsj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39
 *  给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *  candidates 中的数字可以无限制重复被选取。
 *  说明：
 *  所有数字（包括 target）都是正整数。
 *  解集不能包含重复的组合。
 *  示例 1:
 *  输入: candidates = [2,3,6,7], target = 7,
 *  所求解集为:
 *  [
 *  [7],
 *  [2,2,3]
 *  ]
 * @author sj
 * @create 2018/10/15
 */

public class CombinationSum {static List<List<Integer>> res=new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list =new ArrayList<>();
        Arrays.sort(candidates);
        doCombinationSum(candidates,0,target,list);
        return res;
    }
    private void doCombinationSum(int[] candidates, int index, int target,List<Integer> list) {
        for(int i=index;i<candidates.length;i++){
            if(target==candidates[i]){
                list.add(candidates[i]);
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }else if(target>candidates[i]){
                list.add(candidates[i]);
                doCombinationSum(candidates,i,target-candidates[i],list);
                list.remove(list.size()-1);
            }else{
                return;
            }
        }
    }

    public static void main(String[] args) {
        int a[]={10,1,2,7,6,5};
        CombinationSum c=new CombinationSum();
        c.combinationSum(a, 8);
        for (List<Integer> i : res) {
            System.out.println(i);
        }
    }
}
