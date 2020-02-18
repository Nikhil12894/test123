node{
    stage('SCM Checkout'){
        git 'https://github.com/Nikhil12894/test123'
    }
    
    stage('maven clean'){
        bat 'mvn clean'
    }
    stage('maven install'){
        bat 'mvn install'
    }


}
