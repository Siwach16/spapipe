import org.yaml.snakeyaml.Yaml
import static groovy.json.JsonOutput.prettyPrint
import static groovy.json.JsonOutput.toJson

def call(jconfig) {
  stage("addjenkins"){
    Yaml parser = new Yaml()
    def config=parser.load("""
        build:
            name: Run Build
            commands: [ 'yarn install --cache-folder .cache' ]
            cleanupCommands: []
""")
    jconfig.jenkfile = config
  }
}
