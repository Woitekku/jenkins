def call(Map args) {

    pipeline {
        agent any

        stages {
            stage('step 2') {
                steps {
                    println('echo doing')
                }
            }
        }
    }
}