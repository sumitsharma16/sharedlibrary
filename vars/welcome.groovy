#!/usr/bin/env groovy 

def call(Map parameter){
  config = readPropFiles(
        configFile: "${parameter.configFile}"
  )
  
  echo "${config.parameter}"

  }
