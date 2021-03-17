package dk.sunepoulsen.tech.enterprise.labs.helloworld.ct

import dk.sunepoulsen.tech.enterprise.labs.core.component.tests.spock.DefaultDeploymentSpockExtension

class DeploymentSpockExtension extends DefaultDeploymentSpockExtension {
    static String CONTAINER_NAME = 'tel-health-service'

    DeploymentSpockExtension() {
        super('ct', [CONTAINER_NAME])
    }
}
