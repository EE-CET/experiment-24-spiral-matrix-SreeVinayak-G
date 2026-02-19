import java.util.*;
public class SpiralMatrix {
        private static List<Integer> spiral(int[][] mat){
                int left=0,top=0,right = mat[0].length-1,bottom = mat.length-1;
                List<Integer> ls = new ArrayList<>();
                while(top<=bottom && left<=right){
                        for(int i=left;i<=right;i++){
                                ls.add(mat[top][i]);
                        }
                        top++;
                        for(int i=top;i<=bottom;i++){
                                ls.add(mat[i][right]);
                        }
                        right--;
                        if(top<=bottom){
                                for(int i=right;i>=left;i--){
                                        ls.add(mat[bottom][i]);
                                }
                                bottom--;
                        }
                        if(left<=right){
                                for(int i=bottom;i>=top;i--){
                                        ls.add(mat[i][left]);
                                }
                                left++;
                        }
                }
                return ls;
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int n = sc.nextInt();
                int[][] mat = new int[m][n];
                for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                                mat[i][j] = sc.nextInt();
                        }
                }
                List<Integer> ls = spiral(mat);
                for(int i=0;i<ls.size();i++){
                        if(i!=ls.size()-1){
                                System.out.print(ls.get(i)+" ");
                        }else{
                                System.out.print(ls.get(i));
                        }
                }
        }
    
}
