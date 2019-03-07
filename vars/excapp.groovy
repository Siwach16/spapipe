@Grab('org.yaml:snakeyaml:1.17')
import org.yaml.snakeyaml.Yaml
import static groovy.json.JsonOutput.prettyPrint
import static groovy.json.JsonOutput.toJson

def call(jenkfile) {
    def jconfig = [ "jenkfile" : jenkfile]
    node() {
        configureConfig(jconfig)
        build(jconfig)
        }
    }
