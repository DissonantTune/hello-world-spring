pipeline {

agent any
//     agent {
//         docker{
//             image 'gradle:7.2.0-jdk17'
//             args '-v /tmp:/tmp'
//             reuseNode true
//         }
//     }
    stages {
        stage('Build') {
            steps {
                sh '''
                docker --version
                whoami
                   # ./gradlew build --DskipTest
                   # gradle --version
                    # echo Build
                    '''
            }
        }
        stage('Test'){
            steps {
                sh '''
                        echo Testing

                    '''
            }
        }
         stage('Deploy'){
             steps {
                sh '''
                    echo Deploy
                   '''
             }
         }
    }
}
