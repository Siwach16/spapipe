
def call(jconfig){
  println jconfig
  jconfig.build.commands.each { cmd -> sh cmd }
}
