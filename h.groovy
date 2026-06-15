pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Code checked out successfully'
            }
        }

        stage('Build') {
            steps {
                sh 'echo Building the project...'
                sh 'ls -la'
            }
        }

        stage('Test') {
            steps {
                sh 'echo Running tests...'
                sh 'cat codechanges.txt'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo Deploying...'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}