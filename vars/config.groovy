def call(Map param = [:]) {
    configData = readYaml file: "jenkins_env_conf.yml"

    if (param.version.matches('')) param.version = configData.version
    if (param.nVersion.matches('')) param.nVersion = configData.nVersion
    
    if (param.nVersion == null) error 'nVersion not found in jenkins_env_conf'
    if (configData.path == null) error 'path not found in jenkins_env_conf'

    return [path: configData.path, version: param.version, nVersion: param.nVersion]
}