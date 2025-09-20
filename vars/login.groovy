def login(String DOCKER_PASS, String DOCKER_USER){
  sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
}
