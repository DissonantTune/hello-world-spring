pipeline {
//    agent any
    agent {
        docker {
            image '8.6.0-jdk'
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                     gradle --version
//                        echo "Building"
//                        ./gradlew clean build --DskipTests   
                    '''
            }
        }
        stage('Test'){
            steps {
                sh '''
                        echo "Testing"
//                        ./gradlew test
                    '''
            }
        }
        stage('Deploy') {
            steps {
                sh ''' 
                        echo "Deploying

                    '''
            }
        }
    }
}