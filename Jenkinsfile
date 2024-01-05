pipeline {
    agent any
    environment {
    MK_NAME = "temp"
    CRED = credentials("mkpipeline")
    }
    stages {
        stage('build') {
            steps {
                echo " building the application"
                echo "name of file=${MK_NAME}"
            }
        }
        stage('test') {
            when {
                    expression{
                    BRANCH_NAME =='dev-branch1'
                    }
            }
            steps {
                echo " testing the application"
                
            }
        }
        stage('deploy') {
            steps {
                echo " deploying the application"
                echo "credential = ${CRED}"
            }
        }
    }
}
