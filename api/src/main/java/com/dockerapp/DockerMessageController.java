package com.dockerapp;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/")
public class DockerMessageController {

    @Inject
    DockerMessageService dockerMessageService;

    @Get("/getDockerMessage")
    HttpResponse<DockerMessage> getDockerMessage() {
        DockerMessage dockerMessage = dockerMessageService.getDockerMessage();
        return HttpResponse.ok(dockerMessage);
    }
}
