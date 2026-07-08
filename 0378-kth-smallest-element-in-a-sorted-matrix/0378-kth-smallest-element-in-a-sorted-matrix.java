class Solution {
    public int kthSmallest(int[][] matrix, int k) {


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int n = matrix.length;
        int count = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int elem = matrix[i][j];
                if(count < k)
                {
                    maxHeap.offer(elem);
                    count++;

                }
                else if(!maxHeap.isEmpty())
                {
                    
                    if(elem <= maxHeap.peek())
                    {
                        maxHeap.poll();
                        maxHeap.offer(elem);

                    }

                }



            }
        }


        return maxHeap.poll();

        
    }
}