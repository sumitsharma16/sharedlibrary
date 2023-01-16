def readPropFiles(Map parameter) {
    config = readProperties file: "${parameter.configFile}"
    return config
}
