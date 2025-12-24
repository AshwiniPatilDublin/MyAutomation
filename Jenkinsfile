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
                // Use 'bat' for Windows, 'sh' for Linux/macOS
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Add deploy commands here if any
            }
        }
    }

    post {
        always {
            echo 'Archiving test results...'
            // Archive JUnit test reports for test trend
            junit '**/target/surefire-reports/*.xml'
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}

    
