pipeline {
    agent any
        stages {
            stage('Build') {
                build()
            }
            stage('Test') {
                test()
            }
            stage('Test2') {
                test()
            }
            stage('Deploy') {
                deploy()
            }
    }
}

