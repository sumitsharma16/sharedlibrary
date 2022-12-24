def call(Map parameter){
  configFile: 'config.properties'
  echo "${parameter.name}"
}
