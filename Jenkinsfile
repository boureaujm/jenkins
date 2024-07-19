pipeline {
    agent any    
    stages {

        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git credentialsId: '76a606d3-7c57-4da9-95fb-3b99ba7a689e', url: 'https://github.com/boureaujm/CountriesApi.git'
            }
            
        }
        stage('Build') {
            steps {
                script {
                    echo 'áéíóú'
                    emailext body: '<h1>accentué<h1/>', subject: 'test', to: 'contact@boureajm.fr'
                }
            }
        }
    }
}
