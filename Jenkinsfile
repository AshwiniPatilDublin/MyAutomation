pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                echo 'Building, testing and generating site report...'
                bat 'mvn clean test site'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }

    post {
        always {
            echo 'Publishing Surefire HTML Report...'
            publishHTML([
                reportDir: 'target/site',
                reportFiles: 'surefire-report.html',
                reportName: 'Surefire Test Report',
                keepAll: true,
                alwaysLinkToLastBuild: true,
                allowMissing: false
            ])
        }
    }
}
