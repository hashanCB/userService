library(
    identifier:"shared-library-Jenkins@main",
    retriever:modernSCM([
        $class:'GitSCMSource',
        remote:'https://github.com/hashanCB/shared-library-Jenkins.git',
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

            stage("Docker Lgoin"){
            steps {
                  Dockerlogin()
                    }
        } //end build image

         stage("Docker image push"){
            steps {
                  DockerPush("hashanc2/userservice:1.0.1")
                    }
        } //end build image



    }




}