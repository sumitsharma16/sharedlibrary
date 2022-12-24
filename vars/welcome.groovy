#!/usr/bin/env groovy 
def readPropFiles(Map parameter) {
    config = readProperties file: "${parameter.configFile}"
    return config
}

def call(Map parameter){
  config = pipelineConfig.readPropFiles(
        configFile: "${parameter.configFile}"
  )
  
  echo "${config.parameter}"

  }
