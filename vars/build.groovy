
def call(jconfig){
  jconfig.build.commands.each { cmd -> sh cmd }
}
