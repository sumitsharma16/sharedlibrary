def call(Map parameter){

 // config = readProperties file: "${parameter.configFile}"
  config = pipelineConfig.readPropFiles(
        configFile: "${parameter.configFile}"
    )
  
  echo "#########################################"
  echo "${config}"
  echo "${config.name}"
  echo "#########################################"
  bitbucket.checkoutCode(
    stageName: "Checkout SCM",
    GIT_URL: "${config.GIT_URL}",
    BRANCH: "${config.BRANCH}"
  )
  test.test()
}
