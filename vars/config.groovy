def call(Map param = [:]) {
    configData = readYaml file: "jenkins_env_conf.yml"

    if (param.version.matches('')){
        param.version = configData.version   
    }

    if (param.path.matches('')){
        param.path = configData.path
    }

    return [path: param.path, version: param.version]
}