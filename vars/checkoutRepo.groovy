def call(jconfig) {
    stage('git'){
        config.scmVars = checkout scm   
    }
}
