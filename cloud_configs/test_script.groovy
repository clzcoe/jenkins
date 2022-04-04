def another_stage() {
  return {
          node{
             cleanWs()
             return this
          }
  }
}
