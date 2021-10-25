package October_2021;

//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
//
//        每行的元素从左到右升序排列。
//        每列的元素从上到下升序排列。
//         
//
//        示例 1：
//
//
//        输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
//        输出：true
//        示例 2：
//
//
//        输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
//        输出：false

public class SearchA2DMatrixII_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean ans = false;

        int i = m - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] == target) {
                ans = true;
                break;
            } else if (matrix[i][j] < target) {
                j++;
            } else i--;
        }
        return ans;
    }
}
