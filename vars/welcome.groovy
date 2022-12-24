#!/usr/bin/env groovy 
def readPropFiles(Map parameter) {
    config = readProperties file: "${parameter.configFile}"
    return config
}

def call(Map parameter){
  config = welcome.readPropFiles(
        configFile: "${parameter.configFile}"
  )
  
  echo "${config.parameter}"

  }
