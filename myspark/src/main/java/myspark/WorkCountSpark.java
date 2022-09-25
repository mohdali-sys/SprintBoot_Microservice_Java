package myspark;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class WorkCountSpark {

	
	public static void main(String[] args) {
		
		
		SparkConf conf= new SparkConf();
		conf.setAppName("Word count");
		conf.setMaster("local");
		Map<String,Integer> m= new HashMap<String,Integer>();
		JavaSparkContext jsc = new JavaSparkContext(conf);
	JavaRDD<String>	input=jsc.textFile("C:\\Users\\tahamad\\Desktop\\ancredit\\ps\\p\\Project\\Todo.txt");
	input.collect().stream().forEach(e -> System.out.println(e));
	System.out.println(input.collect().stream().count());
	
	JavaRDD<String> splitedString=	input.flatMap(e -> Arrays.asList(e.split(" ")).iterator());
	JavaPairRDD<String,Integer> count=	splitedString.mapToPair(t -> new Tuple2<>(t,2)).reduceByKey((x,y) -> (int)x + (int) y);
	
	System.out.println("splitedString :"+count.collectAsMap());
	count.saveAsTextFile("result");	
		jsc.close();
		
	}
}
