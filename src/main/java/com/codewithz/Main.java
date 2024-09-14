package com.codewithz;

import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {

        SparkSession spark=SparkSession.builder()
                .appName("Spark Session")
                .master("local[4]")
                .getOrCreate();
    }
}