package at.stderr.Exercises;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PaintJob {
    static final Logger log = Logger.getLogger(PaintJob.class.getName());
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <=0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ) {
            return -1;
        }

        double area = width * height;
        // log.log(Level.INFO, "area: {0}", area);
        double bucketCount = (area / areaPerBucket) - (double)extraBuckets;
        // log.log(Level.INFO("bucketCound: {0}", bucketCount));

        return (int) Math.ceil(bucketCount);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
