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
                                sh 'npm test'

                            }
                        }
            } //end building

        stage("build image"){
            steps {
                    script{
                            echo "build image"
                            sh 'docker build -t userservice:1.0.0 .'
                            sh 'docker images'
                        }
                    }
        } //end build image

    }




}