pipeline {
  agent any   // use your agent's label; or use   'any' 
  stages {    // this is to initiate stages in pipeline
    stage('Checkout') {
      steps {
        checkout scm
      }
    }
    stage('Build & Test') {
      steps {
        sh 'mvn -B clean package'
      }
    }
    stage('Publish Results & Artifacts') {
      steps {
        junit 'target/surefire-reports/*.xml'
        archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
      }
    }
  }
  post {
    always {
      echo "Build finished: ${currentBuild.currentResult}"
    }
  }
}
