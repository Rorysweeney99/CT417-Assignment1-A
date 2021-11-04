pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                sh './gradlew clean'
            }
        }
        stage('build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('test'){
            steps {
                sh './gradlew test'
            }
        }
    }
}