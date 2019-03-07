@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml
import static groovy.json.JsonOutput.prettyPrint
import static groovy.json.JsonOutput.toJson

def call(jconfig) {

    node() {
        configureConfig(jconfig)
        build(jconfig)
        }
    }
