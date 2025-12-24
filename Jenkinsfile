pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code from GitHub...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test surefire-report:report'
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
