#!/usr/bin/env groovy 

def call(Map parameter){
  def config = readFile 'config.properties'
  echo "${config.parameter}"

  }
