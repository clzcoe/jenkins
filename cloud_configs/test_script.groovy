def another_stage() {
  node{
    stage('test123') {
        cleanWs()
        script {
          sh "whoami"
        }
    }
  }
}
