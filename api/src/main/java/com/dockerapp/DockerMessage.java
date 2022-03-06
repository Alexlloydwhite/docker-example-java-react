package com.dockerapp;

public class DockerMessage {
    final String dockerMessage;

    public DockerMessage(final String dockerMessage) {
        this.dockerMessage = dockerMessage;
    }

    public String getDockerMessage() {
        return dockerMessage;
    }
}
