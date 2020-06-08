// vars/evenOrOdd.groovy
def call() {
        pipeline {
            agent any
            stages {
                stage('Odd Stage') {
                    steps {
                        echo "Called the Upload Function"
                    }
                }
            }
        }
}