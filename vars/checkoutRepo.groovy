def call(jconfig) {
    stage('git'){
        jconfig.scmVars = checkout scm   
    }
}
