#!/usr/bin/env groovy 
cleanWs()
def call(Map parameter){
  config = readProperties file: "${parameter.configFile}"
  echo "${config.parameter}"

  }
