# Manual

```
mvn clean install docker:build
docker run -p 8080:8080 --name helloworld -t ws13-learning/springboot-docker-hello-world:0.0.1-SNAPSHOT
docker ps
docker stop <CONTAINER_ID>
```

