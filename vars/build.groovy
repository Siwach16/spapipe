
def call(jconfig){
  println jconfig
  jconfig.jenkfile.build.commands.each { cmd -> sh cmd }
}
