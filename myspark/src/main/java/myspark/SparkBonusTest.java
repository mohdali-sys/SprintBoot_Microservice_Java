package myspark;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkBonusTest
{
    private static final String CSV_URL = "bonus.csv";

    public static void main(String args[])
    {

        List<Double> inputData = new ArrayList<Double>();
        inputData.add(35.5);
        inputData.add(54.8);
        inputData.add(34.9);
        inputData.add(12.32);
        inputData.add(76.2);
        inputData.add(68.1);
        SparkConf conf = new SparkConf().setAppName("myspark").setMaster("local[*]");
        JavaSparkContext jsc = new JavaSparkContext(conf);
        JavaRDD<Double> myRDD = jsc.parallelize(inputData);
        jsc.close();

    }
}
