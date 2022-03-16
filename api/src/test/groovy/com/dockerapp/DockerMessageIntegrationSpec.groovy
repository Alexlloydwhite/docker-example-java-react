package com.dockerapp

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class DockerMessageIntegrationSpec extends Specification {

    @Inject
    @Client("/")
    HttpClient client

    def "Returns JSON with the Docker message"() {
        when:
        String response = client.toBlocking().retrieve(HttpRequest.GET("/getDockerMessage"))

        then:
        response == """{"dockerMessage":"Hello from Docker!"}"""
    }
}
