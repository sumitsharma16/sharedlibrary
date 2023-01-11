def call(Map parameter){

  config = readProperties file: "${parameter.configFile}"
  echo "${config.name}"

  bitbucket.checkoutCode(
    stageName: "Checkout SCM",
    GIT_URL: "${config.GIT_URL}",
    BRANCH: "${config.BRANCH}"
  )
  test.test
}
