#!/usr/bin/env groovy 
cleanWs()
def call(Map parameter){
  def props = readProperties  file: 'config.properties'
  echo "${props.parameter}"

  }
