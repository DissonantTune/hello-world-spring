pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                        echo "Building"
                        ./gradlew clean build --DskipTests   
                    '''
            }
        }
        stage('Test'){
            steps {
                sh '''
                        echo "Testing"
                        ./gradlew test
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