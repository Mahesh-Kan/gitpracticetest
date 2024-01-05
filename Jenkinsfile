def gv
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
         stage('init') {
            steps {
                script{
               gv= load "groovy.script"
                }
            }
        }
        stage('build') {
            steps {
               script {
                   gv.buildApp()
               }
            }
        }
        stage('test') {
            when {
                    expression{
                    BRANCH_NAME =='dev-branch1'
                    }
            }
            steps {
                 script {
                   gv.testApp()
               }
                
            }
        }
        stage('deploy') {
                when {
                    expression {
                        params.testtag
                    }
                }
            steps {
                 script {
                   gv.deployApp()
               }
               
                
            }
        }
    }
}
