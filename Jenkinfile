pipeline {
  agent any
  
  environment {
    DEMO = '1'
  }
  
  stages {
    stage('stage1') {
      steps {
        echo "This is the build number $BUILD_NUMBER of demo $DEMO"
        sh '''
           echo "Using multi-line shell step"
           chmod +x test.sh
           ./test.sh
           '''
      }
    }
  }

}
