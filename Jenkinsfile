@Library('shared-library') _
pipeline {
    agent any
        stages {
            stage('Build') {
                steps {
                var1()
                }
            }
            stage('Test') {
                steps {
                var2()
                }
            }
            stage('Deploy') {
                steps {
                var3()
                sh "env"
                }
            }
        }
}