#!/usr/bin/env groovy 

def call(Map parameter){
  config = readProperties(
        configFile: "${parameter.configFile}"
  )
  
  echo "${config.parameter}"

  }
