def another_stage() {
    node{
        stage('Test123') {
          cleanWs()
          return this
        }
    }
return this
}
