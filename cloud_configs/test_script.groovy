def another_stage() {
    node{
          cleanWs()
          return this
    }
}
