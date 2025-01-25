//Standrd Deviation
import.java.util.Arrays;
public class ArrayStatistics{
    public static void main(String[]args){
        int[]data = {2,5,5,9,4,7,0,9,6,11,12};
        double mean=calculateMean(data);
        system.out.println('Mean:'+ mean);
        double median = calculateMesddisn(data);
        system.out.print("Median:" + median);
        double standarddeviation = calculate StandardDeviatioom (data,mean);
        system.out.println("Standard Deviation:" + StandardDeviation);
        }
    public static doublecalculateMean(int{}arr){
        double sum = 0;
        for(int num: arr){
            sum + = num;
        }
        return sum/ arr length;
    }
    public static doublecalculateMedian(int[]arr){
        Arrays soft(arr);
        int n = data.length;
        if(n%2 == 0){
            return(arr[n/2-1]+arr[n/2])/2.0;
        }
        else{
            return arr{n/2};
        }
    }
    public static doublecalculatestandardDeviation(int[]arr;double mean){
        double sumSquaredDifferences = 0;
        for(int num:arr){
            sumSquaredDifferences + =Math.pow(num-mean,2);
        }
        return Math.sqrt(sumSquaredDifferences/arr.lenght);

    }
}