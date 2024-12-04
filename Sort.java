class Sort{
    public static void main(String[] args) {
        int i,j;
        int arr[]=new int[args.length];
        for(i=0;i<args.length;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(i=0;i<args.length;i++){
            for(j=0;j<args.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}