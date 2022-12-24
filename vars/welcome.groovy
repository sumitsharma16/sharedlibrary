#!/usr/bin/env groovy 

def call(Map parameter){
  def configs = readProperties 'config.properties'
  echo "${configs.parameter}"

  }
