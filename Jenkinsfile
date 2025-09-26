pipeline {
  agent { label 'agent_1' }   // use your agent's label; or use 'any'
  tools {
    maven 'Maven'             // tool name from Global Tool Configuration
    jdk 'JDK17'               // JDK tool name from Global Tool Configuration
  }
  stages {
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
