pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                echo 'Building and testing...'
                bat 'mvn clean test surefire-report:report'
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
