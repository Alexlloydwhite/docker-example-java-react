# Hello World
This is a Hello World app. The backend is Java / Micronaut and the frontend is TypeScript / React.<br/>
It is fully tested (Jest / Spock) and containeried with Docker. There is a Gitbub Actions workflow to run tests and deploy to Dockerhub. 

## Future Enhancements
- Github Actions deploys to AWS
- Create a database to store the docker message

# Containers
A predictable, consistent, and reliable environment.

A box that contains everything an application needs to run (source code, dependencies, run environment, OS, etc). This container can run the application in isolation. Everything the app needs to run is in the container.

## Containers VS Virtual Machines

- Virtual Machines  
Has it's own full operating system & typically slower
- Containers    
Share the host's operating system & typically quicker

# Images
Containers are built using an Image. Images are made up from several "layers". When docker builds an image, it stores each layer in a cache. So, building subsequent images will become faster!

## Parent Image
Includes the OS & sometimes the runtime environment

## Child Images
Built on top of the parent image. Parent Image -> Source Code -> Dependencies -> Run Commands

# Using Docker from the Terminal

## Building an Image
```console
docker build -t myapp2 .
```

## Starting a container
```console
docker run --name myapp_c1 -p 4000:4000 -d myapp
```
--name sets the name of the container
<br>
-p plus local port:container port
<br>
-d to not block the terminal
<br>
name of image
<br>

## Stopping a Container
``` console
docker stop containerName
```

``` console
docker stop containerId
```

## Managing Containers and Images
View all running containers:
```console
docker ps
```

View all containers (including non running containers):
```console
docker ps -a
```

View all images:
```console
docker images
```

Deleting an image:
``` console
docker image rm imageName
```

Deleting an image that has a running container
``` console
docker image rm imageName -f
```

Deleting a container
```console
docker container rm containerName
```

Deleting multiple containers
```console
docker container rm containerName containerName2 containerName3
```
