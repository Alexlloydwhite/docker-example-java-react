package com.dockerapp

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class DockerMessageServiceSpec extends Specification {

    @Subject
    DockerMessageService sut = new DockerMessageService()

    def "Service returns docker message"() {
        when:
        DockerMessage dockerMessage = sut.getDockerMessage()

        then:
        dockerMessage.dockerMessage == "Hello from Docker!"
    }
}
