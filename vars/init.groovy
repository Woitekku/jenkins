def call(Map args) {

    pipeline {
        agent any

        stages {
            stage('step 1') {
                steps {
                    init()
                }
            }
        }
    }
}