
Public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        System.out.println(sortedStr);



   system.out.print(a);

    }
}



 *
 *  Scanner sc = new Scanner(System.in);
 *
 *         int a;
 *
 *         a= sc.nextInt();
 *         int[] arr= new int[a];
 *
 *         for(int i=0;i<a;i++){
 *             arr[i]= sc.nextInt();
 *         }
 *         Arrays.sort(arr);
 *
 *         int i=0;
 *         for(int j=1;j<nums.length;j++){
 *             if(nums[j]!=nums[j-1]){
 *                 System.out.println(nums[j]);
 *                 i++;
// *             }
 *         }
