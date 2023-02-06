def call() {
    configData = readYaml file: "jenkins_env_conf.yml"
    path = configData.path
    echo "$path"
}