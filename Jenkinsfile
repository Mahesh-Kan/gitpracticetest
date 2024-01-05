pipeline {
    agent any
    MK_NAME = "temp"
    stages {
        stage('build') {
            steps {
                echo " building the application"
                echo "name of file={MK_NAME}"
            }
        }
        stage('test') {
            when {
                    expression{
                    BRANCH_NAME =='dev'
                    }
            }
            steps {
                echo " testing the application"
                
            }
        }
        stage('deploy') {
            steps {
                echo " deploying the application"
            }
        }
    }
}
