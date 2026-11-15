pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Users\\arjun\\AppData\\Local\\Programs\\Eclipse Adoptium\\jdk-17.0.21.9-hotspot'
    }
    stages {
        stage('Test') {
            steps {
                bat '.\\mvnw.cmd test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Build') {
            steps {
                bat '.\\mvnw.cmd clean package -DskipTests'
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                }
            }
        }
    }
}