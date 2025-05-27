def build() {
  sh 'mvn clean install'
  sh 'mvn test'
}
