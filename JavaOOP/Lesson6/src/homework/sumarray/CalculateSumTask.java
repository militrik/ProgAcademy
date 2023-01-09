package homework.sumarray;

public class CalculateSumTask implements Runnable {
    private int sum;
    private int[] numsArray;
    private int beginIdx;
    private int endIdx;

    public CalculateSumTask(int[] numsArray, int beginIdx, int endIdx) {
        this.numsArray = numsArray;
        this.beginIdx = beginIdx;
        this.endIdx = endIdx;
    }

    public int getSum() {
        return sum;
    }

    public int calculateSum() {
        int temp = 0;
        for (int i = beginIdx; i < endIdx; i++) {
            temp += numsArray[i];
        }
        //System.out.println(temp);
        return temp;
    }

    @Override
    public void run() {
        sum = calculateSum();

    }
}
