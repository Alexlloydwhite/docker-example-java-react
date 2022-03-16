package com.dockerapp;

import jakarta.inject.Singleton;

@Singleton
public class DockerMessageService {

    DockerMessage getDockerMessage() {
        return new DockerMessage("Hello from Docker!");
    }
}
