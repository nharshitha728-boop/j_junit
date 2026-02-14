pipeline {
    agent any
    stages {
        stage('Build & Test') {
            steps {
                // We do it all in one go. Maven will generate the HTML report automatically.
                bat 'mvn clean test -Dmaven.test.failure.ignore=true'
            }
            post {
                always {
                    // This one always works because the JUnit plugin is built-in
                    junit '**/target/surefire-reports/*.xml'
                    
                    // Instead of a 'step', we just save the folder so you can see it
                    archiveArtifacts artifacts: 'target/site/jacoco/**', allowEmptyArchive: true
                }
            }
        }
    }
}
