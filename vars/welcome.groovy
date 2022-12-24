#!/usr/bin/env groovy 

def call(Map parameter){
  def config = readProperties file: "../config.properties"
  echo "${config.parameter}"

  }
