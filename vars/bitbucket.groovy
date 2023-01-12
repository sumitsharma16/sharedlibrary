def checkoutCode(Map parameter){
    //def GIT_URL = "${parameter.GIT_URL}"
    cleanWs()
    //def BRANCH = "${parameter.BRANCH}"
    def GIT_URL = "https://bitbucket.org/tangerinelife/tangerine-dev-api-webpage/"
    def BRANCH  =  "jenkins-test"
    stage("${parameter.stageName}"){
        try{
            checkout([$class: 'GitSCM', 
            branches: [[name: "${BRANCH}"]],
            extensions: [],
            userRemoteConfigs: [[
                credentialsId: 'bitbucket',
                url: "${GIT_URL}"
                 ]]])
        }
        catch (err) {
                echo "Job Failed $err"
        }
    }
}
