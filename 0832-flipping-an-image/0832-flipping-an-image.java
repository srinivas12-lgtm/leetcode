class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr= new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            int k=image.length-1;
            for(int j=0;j<image.length;j++){
                if(image[i][k]==0){  
                arr[i][j]=1;
                k--;
                }
                else{
                arr[i][j]=0;
                k--;
                }
            }  
        }
        return arr;
    }
}