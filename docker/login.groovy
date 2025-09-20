def login(){
  sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
}
