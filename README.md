docker_aws_dynamodb_local_test
==============================

Shows usage of Docker image deangiberson/aws_dynamodb_local


To use run

    sudo docker run -d --name dynamodb deangiberson/aws-dynamodb-local

    sudo docker run --rm -P --link dynamodb:dynamodb deangiberson/aws-dynamodb-local-test
