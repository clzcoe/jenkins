def another_stage() {
  node{
    stage('test123') {
      steps {
        cleanWs()
        script {
          sh "whoami"
        }
      }
    }
  }
}
