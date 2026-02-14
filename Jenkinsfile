pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
    steps {
        bat 'mvn test -Dmaven.test.failure.ignore=true'
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            // Add this line to record the coverage report
            recordCoverage(tools: [[parser: 'JACOCO', pattern: '**/target/site/jacoco/jacoco.xml']])
        }
    }
}
    }
}
