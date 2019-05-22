package com.adidas.product.worker;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;

public class SchemaGenerator {

    public static void main(String[] args) {
        Schema launchSchema = SchemaBuilder.record("WorkerLaunch")
                .namespace("com.adidas.product.worker")
                .fields()
                .requiredString("id")
                .requiredString("brand")
                .requiredString("consumer")
                .requiredString("flow")
                .name("locale")
                .type()
                .array()
                .items()
                .stringType()
                .noDefault()
                .endRecord();

        Schema failureSchema = SchemaBuilder.record("WorkerFailure")
                .namespace("com.adidas.product.worker")
                .fields()
                .requiredString("id")
                .requiredString("consumer")
                .requiredLong("millis")
                .requiredString("exception")
                .optionalString("stacktrace")
                .endRecord();

        Schema resultSchema = SchemaBuilder.record("ResultSchema")
                .namespace("com.adidas.product.worker")
                .fields()
                .requiredString("id")
                .requiredString("consumer")
                .requiredString("millis")
                .requiredString("jobFlow")
                .optionalString("jobExecution")
                .endRecord();

        System.out.println(launchSchema.toString());
        System.out.println(failureSchema.toString());
        System.out.println(resultSchema.toString());
    }

}
