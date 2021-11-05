public class Search {
    public static void main(String[] args) {
        int [] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int elm = 19;
        int idx =-1;
        for (int i = 0 ;i<arr.length;i++)
        {
            if (elm == arr[i])
            {
                idx = i;
                break;
            }
        }
        if(idx != -1)
        {
            System.out.println(elm + " found at index " + idx);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
