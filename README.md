This is a small example to illustrate how to use Docker with SpringBoot projects.

The maven plugin io.fabric8:docker-maven-plugin is used to build Docker images with the fat jars of the SpringBoot projects.
It can be used to start / stop Docker containers to run integration tests (not done yet).

To run all the Docker containers once, use the following command:

```
docker-compose up
```