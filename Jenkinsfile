pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                bat '.\\mvnw.cmd test'
            }
        }
        stage('Build') {
            steps {
                bat '.\\mvnw.cmd clean package -DskipTests'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}