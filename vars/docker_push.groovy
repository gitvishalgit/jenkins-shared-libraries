def call(String Project, String ImageTag, String dockrehubuser){
  withCredentials([usernamePassword("credentialsId":"dockerhubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockrehubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
