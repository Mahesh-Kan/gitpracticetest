pipeline {
    agent any
    environment {
    MK_NAME = "temp"
    CRED = credentials("mkpipeline")
    }
    parameters {
        choice(name: 'version',choices:['1.1.0','1.2.0','1.3.0'],description:'version selection')
        booleanParam(name:'testtag',defaultValue:true, description:'booleanparameters')
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
                when {
                    expression {
                        params.testtag
                    }
                }
                 echo " deploying the application" 
                
            }
        }
    }
}
