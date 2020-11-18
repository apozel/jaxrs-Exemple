#!/bin/bash

NOMPROJET=test

mvn clean install

docker build -t $NOMPROJET .

docker run --rm --name $NOMPROJET -it -p 8080:8080 $NOMPROJET:latest
