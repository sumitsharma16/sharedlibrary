def checkoutCode(Map parameter){
    def GIT_URL = "${parameter.GIT_URL}"
    def BRANCH = "${parameter.BRANCH}"

    stage("${parameter.stageName}"){
        try{
            checkout([$class: 'GitSCM', 
            branches: [[name: '"${BRANCH}"']],
            extensions: [],
            userRemoteConfigs: [[
                credentialsId: 'bitbucket',
                url: '"${GIT_URL}"'
                 ]]])
        }
        catch (err) {
                echo "Job Failed"
        }
    }


}
