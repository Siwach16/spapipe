import org.yaml.snakeyaml.Yaml
import static groovy.json.JsonOutput.prettyPrint
import static groovy.json.JsonOutput.toJson

def call() {
  stage("addjenkins"){
    Yaml parser = new Yaml()
    def jconfig=parser.load("""
        build:
            name: Run Build
            commands: npm install
            cleanupCommands: []
""")
  }
}
