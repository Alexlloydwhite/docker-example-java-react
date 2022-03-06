package com.dockerapp;

import jakarta.inject.Singleton;

@Singleton
public class DockerMessageService {

    final DockerMessage dockerMessage = new DockerMessage("Hello from Docker!");

    DockerMessage getDockerMessage() {
        return dockerMessage;
    }
}
