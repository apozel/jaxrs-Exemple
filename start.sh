#!/bin/bash

NOMPROJET=test

docker build -t $NOMPROJET .

docker run --rm --name tulipe -it -p 8080:8080 $NOMPROJET