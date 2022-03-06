package com.dockerapp

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Subject

@MicronautTest
class DockerMessageControllerSpec extends Specification {

    @Subject
    DockerMessageController sut = new DockerMessageController(
            dockerMessageService: Mock(DockerMessageService)
    )

    def "getDockerMessage calls the dockerMessageService"() {
        when:
        sut.getDockerMessage()

        then:
        1 * sut.dockerMessageService.getDockerMessage()
    }
}
