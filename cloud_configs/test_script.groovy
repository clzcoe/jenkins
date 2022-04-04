def another_stage() {
          script {
                    echo "this is from called stage"
          }
          cleanWs()
}
return this
