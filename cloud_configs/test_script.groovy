def another_stage() {
    dir('cloud_configs') {
          script {
                    echo "$pwd"
          }
          cleanWs()
    }
}
return this
