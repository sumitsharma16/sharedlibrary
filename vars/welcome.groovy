#!/usr/bin/env groovy 

def call(Map parameter){
  config = pipelineConfig.readPropFiles(
        configFile: "${parameter.configFile}"

    echo "${name}"
 
}
