# Manual

```
mvn clean install docker:build
docker run -it --link helloworld:helloworld  ws13-learning/springboot-docker-hello-client:0.0.1-SNAPSHOT
docker ps
docker stop <CONTAINER_ID>
```

