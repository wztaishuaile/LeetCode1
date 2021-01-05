package littleGirl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 最短区间
 * 区间起始位置最小
 */
public class LeetCode632 {
    //贪心
    class NumGroup{
            public NumGroup(int num, int grp){
                this.num = num;
                this.grp = grp;
            }
            int num; //数值
            int grp; //组号
        }
        public int[] smallestRange1(List<List<Integer>> nums) {
            //因为每次都要找最小元素，所以维护一个最小堆比较合适
            PriorityQueue<NumGroup> numgrp = new PriorityQueue<>(new Comparator<NumGroup>(){
                @Override
                public int compare(NumGroup n1, NumGroup n2){
                    return n1.num - n2.num;
                }
            });

            int end = -100001;
            //记录每个数组当前的指针位置，一开始都指向第0个元素，即每个区间的最小元素
            int[] index = new int[nums.size()];

            //起始区间
            for(int i = 0; i < nums.size(); i++){
                if(nums.get(i).get(0) > end) end = nums.get(i).get(0);
                NumGroup num = new NumGroup(nums.get(i).get(0), i);
                numgrp.offer(num);
            }

            int max = end;
            int start = numgrp.peek().num;//取数但不弹出元素
            int min = start;
            int len = end - start + 1;

            while(true){
                //grp为当前最小元素的原数组号，检索并删除此队列的头
                int grp = numgrp.poll().grp;
                //如果当前最小元素已经是原数组最大元素了，则退出
                if(index[grp]+1 == nums.get(grp).size()) break;

                //索引++，并将当前最小元素的原数组中的下一个元素压入优先级队列
                index[grp]++;
                NumGroup n = new NumGroup(nums.get(grp).get(index[grp]), grp);
                numgrp.offer(n);//将指定的元素插入到此优先级队列中
                //当前最大值
                if(n.num > max) max = n.num;
                min = numgrp.peek().num;
                //长度变小
                if(max-min+1 < len){
                    start = min;
                    end = max;
                    len = max-min+1;
                }
            }
            return new int[]{start, end};
         }
    //滑动窗口
    public int[] smallestRange(List<List<Integer>> nums) {
        int N = 0;
        for(List<Integer> num : nums) N += num.size();
        int[][] ordered = new int[N][2];
        int i = 0;
        int j = 0;
        for(List<Integer> group : nums){
            for(Integer num : group){
                ordered[i][0] = num;
                ordered[i][1] = j;
                i++;
            }
            j++;
        }
        Arrays.sort(ordered, (o1, o2) -> (o1[0] - o2[0]));
        int[] ans = new int[2];
        int[] count = new int [nums.size()];
        int k = 0;i = 0;
        for(j = 0; j < N; j++){
            if(0 == count[ordered[j][1]]++) k++;
            if(k == nums.size()){
                while(count[ordered[i][1]] > 1)count[ordered[i++][1]]--;
                if((ans[0] == 0 && ans[1] == 0 )|| ans[1] - ans[0] > ordered[j][0] - ordered[i][0]){
                    ans = new int[]{ordered[i][0],ordered[j][0]};
                }
            }
        }
        return ans;
    }

}
