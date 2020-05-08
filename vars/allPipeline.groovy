def call(body) {
def pipelineParams= [:]
body.resolveStrategy = Closure.DELEGATE_FIRST
body.delegate = pipelineParams
body()

pipeline {
    agent any
        stages {
            stage('Stage1') {
                steps {
                var1()
                }
            }
            stage('Stage2') {
                steps {
                var2()
                }
            }
            stage('Stage3') {
                steps {
                var3()
                }
            }
        }
}