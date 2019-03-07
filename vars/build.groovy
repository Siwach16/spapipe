
def call(jconfig){
  println jconfig.global
  jconfig.build.commands.each { cmd -> sh cmd }
}
