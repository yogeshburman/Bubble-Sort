class Test {
    public static  void main (String []args){
        System.out.println("Bubble sort");

        int arr[]={65,74,1,0,3,0,32};

        int temp;
        for(int i=0;i<arr.length;i++){
            
            //Comparing and swapping elements
            for(int j=0;j<arr.length-1;j++){
                
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //printing Array elements
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}