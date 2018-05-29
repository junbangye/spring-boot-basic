pipeline {
    agent any

    environment {
        NameSpace='pogba-jay'
        WebServer='172.31.12.139'
        port='8050'
    }

    stages {

        stage('Checkout') {
            steps {
                step([$class: 'WsCleanup'])
            git poll: true, url: 'https://github.com/junbangye/spring-boot-basic.git', branch: 'master'
            }

        }

        stage('Sonar') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew sonarqube'
            }
        }

        stage('test') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew test'
            }
        }

        stage('build') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh 'chmod +x deploy.sh'
                    sh './deploy.sh'
                }
            }
        }
    }
}