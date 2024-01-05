def buildApp(){
 echo " building the application"
 echo "name of file=${MK_NAME}"
}

def testApp(){
 echo " testing the application"
}

def deployApp(){
   echo " deploying the application" 
 echo "name of version=${params.version}"
}
return this
  
