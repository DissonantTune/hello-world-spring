pipeline {
    agent {
        docker { image '8.6.0-jdk' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'gradle --version'
            }
        }
    }
}