// def call(body) {
//   def pipelineParams= [:]
//   body.resolveStrategy = Closure.DELEGATE_FIRST
//   body.delegate = pipelineParams
//   body()

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Test2') {
            steps {
                echo 'Testing2..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
}
