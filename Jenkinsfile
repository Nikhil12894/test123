node{
    stage('SCM Checkout'){
        git 'https://github.com/Nikhil12894/test123'
    }
    
    stage('Compile-Package'){
        def mvnHome = tool name: 'Maven', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        bat "${mvnCMD} mvn install"
    }


}
