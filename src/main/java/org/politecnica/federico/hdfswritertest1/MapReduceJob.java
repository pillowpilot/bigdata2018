package org.politecnica.federico.hdfswritertest1;

import java.io.IOException;
import java.util.HashMap;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.codehaus.jackson.map.ObjectMapper;

public class MapReduceJob {

	public static void main(String[] args) {
		Job job;
		try {
			job = Job.getInstance();
			job.setJarByClass(MapReduceJob.class);
			job.setJobName("Global Terrorism - Most used weapon");

			final String inputFilepath = "/attacks/relationships";
			final String outputFilepath = "/output" + System.currentTimeMillis();
			FileInputFormat.addInputPath(job, new Path(inputFilepath));
			FileOutputFormat.setOutputPath(job, new Path(outputFilepath));

			job.setMapperClass(MapReduceJobMapper.class);
			job.setReducerClass(MapReduceJobReducer.class);

			job.setMapOutputKeyClass(LongWritable.class);
			job.setMapOutputValueClass(IntWritable.class);
			
			
			
			//job.setOutputKeyClass(Text.class);
			//job.setOutputValueClass(IntWritable.class);

			System.exit(job.waitForCompletion(true) ? 0 : 1);
		} catch (IOException | ClassNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static class MapReduceJobMapper extends Mapper<LongWritable, Text, LongWritable, IntWritable> {
		@Override
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

			String jsonStr = value.toString();
			System.out.println(jsonStr);
			ObjectMapper mapper = new ObjectMapper();

			HashMap<String, Object> fact = mapper.readValue(jsonStr, HashMap.class);

			Long weaponId = -1l;
			if (fact.containsKey("weaponId")) {
				Integer wid = (Integer) fact.get("weaponId");				
				weaponId = Long.valueOf(wid);
			}

			context.write(new LongWritable(weaponId), new IntWritable(1));
		}
	}

	public static class MapReduceJobReducer extends Reducer<LongWritable, IntWritable, LongWritable, IntWritable> {
		@Override
		public void reduce(LongWritable key, Iterable<IntWritable> value, Context context)
				throws IOException, InterruptedException {

			int totalFrequency = 0;
			for (IntWritable frequency : value) {
				totalFrequency += frequency.get();
			}

			context.write(key, new IntWritable(totalFrequency));
		}
	}
}