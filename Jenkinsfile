library(
    identifier:
    retrieve:modernSCM([
        $class:'GitSCMSource',
        remote:'git@github.com:hashanCB/shared-library-Jenkins.git',
        credentialsid:'	github-credentials'
    ])

)

pipeline{
    agent any
    tools {
        nodejs "nodejs"
    }
    stages{

         stage("build project"){
                steps {
                        script{
                                echo "build project"


                            }
                        }
            } //end building

        stage("build image"){
            steps {
                  DockerBuildimage()
                    }
        } //end build image

    }




}