#!/usr/bin/env groovy 

def call(Map parameter){
  config = readProperties file: "${parameter.configFile}"
  echo "${config.name}"
  

  }
