#!/bin/bash

cd /home/ec2-user/app/amad/zip
sudo mv toyproject-0.0.1-SNAPSHOT.jar /home/ec2-user/docker/project
cd /home/ec2-user/docker

docker-compose down
docker-compose up -d --build
