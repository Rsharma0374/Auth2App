pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Compile and Clean') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn clean compile"
            }
        }
        stage('deploy') {
            steps {
                sh "mvn package"
            }
        }
        stage('Archving') {
            steps {
                archiveArtifacts '**/target/*.jar'
            }
        }
    }
}
