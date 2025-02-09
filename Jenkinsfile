pipeline{
    agent any
    stages{
        stage("build image"){
            steps {
                    script{
                            echo "build image"
                            sh 'docker build -t userservice:1.0.0'
                            sh 'docker images'
                        }
                    }
        }

    }




}