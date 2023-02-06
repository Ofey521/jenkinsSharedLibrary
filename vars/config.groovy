def call(Map param = [:]) {
    configData = readYaml file: "jenkins_env_conf.yml"
    path = configData.path
    echo "$path"
    echo "$param.path"
}