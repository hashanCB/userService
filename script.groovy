  def Awsdeplay(String ImageName){

        script.sshagent(['aws-ec2-userser']) {
            script.sh 'scp -o StrictHostKeyChecking=no docker-compose.yml ec2-user@13.60.196.175:/home/ec2-user'
            script.sh """
            ssh -o StrictHostKeyChecking=no ec2-user@13.60.196.175 '
                export IMAGE_NAME=${ImageName}
                docker-compose -f /home/ec2-user/docker-compose.yml up --detach
            '
        """
        }
    }

return this