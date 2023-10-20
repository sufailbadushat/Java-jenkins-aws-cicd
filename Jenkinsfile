pipeline {
    agent any

    tools {
        maven 'M3'
    }
    stages {
        stage('SCM checkout') {
            steps {
                git 'https://github.com/sufailbadushat/Java-jenkins-aws-cicd.git'
            }
        }
        stage('Maven build') {
             steps {
                 // Run Maven on a Unix agent.
                bat "mvn clean package"
            }
        }
        stage('Build docker image') {
            steps {
                script{
                    bat "docker build -t sufailbadushat/java-jenkins-aws-cicd ."
                }
            }
        }
        stage('Push image to docker hub') {
            steps{
                script{
                    withCredentials([string(credentialsId: 'hub-password', variable: 'hubpass')]) {
                        bat "docker login -u sufailbadushat -p ${hubpass}"
                    }
                    bat "docker push sufailbadushat/java-jenkins-aws-cicd"
                }
            }
        }
    }
}