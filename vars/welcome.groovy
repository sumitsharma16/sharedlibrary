#!/usr/bin/env groovy 

def call(Map parameter){
  def config = readProperties file: "${parameter.configFile}"
  echo "${config.parameter}"

  }
