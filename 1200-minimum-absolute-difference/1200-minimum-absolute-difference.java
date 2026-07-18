class Solution 
{
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++)
        {
            min = Math.min(min, Math.abs(arr[i + 1] - arr[i]));
            
        }
        


        for(int i = 0; i < arr.length - 1; i++)
        {
            if(Math.abs(arr[i + 1] - arr[i]) != min)
            {
                continue;

            }
            else if(Math.abs(arr[i + 1] - arr[i]) == min)
            {
                List<Integer> pair = new ArrayList<>();

                pair.add(arr[i]);
                pair.add(arr[i + 1]);

                list.add(pair);


            }

        }

        

        return list;


        
        
    }
}