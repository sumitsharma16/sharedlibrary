#!/usr/bin/env groovy 

def call(Map parameter){
  def props = readProperties  file: 'config.properties'
  echo "${props.parameter}"

  }
