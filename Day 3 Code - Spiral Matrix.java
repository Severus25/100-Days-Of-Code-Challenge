class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int length = matrix.length;
        if (length == 0) {
            return new ArrayList<Integer>();
        }
        int width = matrix[0].length;
        if (width == 0) {
            return new ArrayList<Integer>();
        }
        int total = length * width;
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int xStart = 0;
        int yStart = 0;
        int xLimit = width - 1;
        int yLimit = length - 1;
        int i = xStart;
        int j = yStart;
        while (start < total) {
            while (start < total && i <= xLimit) {
                result.add(matrix[j][i++]);
                start++;
            }
            i--;
            j++;
            while (start < total && j <= yLimit) {
                result.add(matrix[j++][i]);
                start++;
            }
            j--;
            i--;
            while (start < total && i >= xStart) {
                result.add(matrix[j][i--]);
                start++;
            }
            i++;
            j--;
            while (start < total && j > yStart) {
                result.add(matrix[j--][i]);
                start++;
            }
            xStart++;
            yStart++;
            xLimit--;
            yLimit--;
            i = xStart;
            j = yStart;
        }
        return result;
    }
}
