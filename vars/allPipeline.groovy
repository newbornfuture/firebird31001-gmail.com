def call(body) {
  def pipelineParams= [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()

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