import groovy.io.FileType
def call(Map config = [:]){
    def list = []

    def dir = new File("config.path")
    dir.eachFileRecurse (FileType.FILES) { file ->
    list << file
    }
    list.each {
    println it.path
}
}