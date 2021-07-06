pipeline {
    agent any
    stages {
        stage('Compile') {
            steps { 
               echo "mvn compile"
            }
        }
        stage('test') {
            steps { 
                echo "test"
            }
        }
        stage('package') {
            steps { 
               echo "mvn package"
            }
        }
    }
}
