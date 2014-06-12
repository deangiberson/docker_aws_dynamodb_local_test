package com.deangiberson.TestDynamoDB;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;

public class Main {
    public static void main(String [] args) {
        AWSCredentials cred = new BasicAWSCredentials("AKIAIOSFODNN7EXAMPLE",
                                                      "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY");
        String endpoint = String.format("http://%s:%s",
                                        System.getenv("DYNAMODB_PORT_8000_TCP_ADDR"),
                                        System.getenv("DYNAMODB_PORT_8000_TCP_PORT"));

        AmazonDynamoDBClient client = new AmazonDynamoDBClient(cred);
        client.setEndpoint(endpoint);

        ListTablesResult result = client.listTables();
    }
}
