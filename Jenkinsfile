library(
    identifier:"shared-library-Jenkins@main",
    retriever:modernSCM([
        $class:'GitSCMSource',
        remote:'https://github.com/hashanCB/shared-library-Jenkins.git',
        credentialsid:'	github-credentials'
    ])

)

def gv

pipeline{
    agent any
    tools {
        nodejs "nodejs"
    }
    stages{

        stage("init"){
            steps{
                script{
                    gv =load "script.groovy"
                }
                
            }
        }

        stage("IncrementVersion"){
            steps{
                IncrementVersion()
            }
        }

         stage("build project"){
                steps {
                        script{
                                echo "build project"


                            }
                        }
            } //end building

        stage("build image"){
            steps {
                  DockerBuildimage("hashanc2/userservice:${env.IMAGE_NAME}")
                    }
        } //end build image

            stage("Docker Lgoin"){
            steps {
                  Dockerlogin()
                    }
        } //end build image

         stage("Docker image push"){
            steps {
                  Dockerpush("hashanc2/userservice:${env.IMAGE_NAME}")
                    }
        } //end build image

        stage("deplay aws"){
            steps{
                script{
                    gv.Awsdeplay("hashanc2/userservice:${env.IMAGE_NAME}")
                }
                
            }
        }

        stage("git commit"){
            steps{
                Gitcommint()
            }
        }



    }




}