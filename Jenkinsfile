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
                // The '-Dmaven.test.failure.ignore=true' flag is the secret!
                bat 'mvn test -Dmaven.test.failure.ignore=true'
            }
            post {
                always {
                    // This step reads the XML and turns Jenkins YELLOW if tests failed
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
