node{
    stage('SCM Checkout'){
        git 'https://github.com/Nikhil12894/test123'
    }
    
    stage('Compile-Package'){
        def os = System.properties['os.name'].toLowerCase()
        def mvnHome = tool name: 'Maven', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        echo "OS: ${os}"
        if (os.contains("linux")) {
         sh "${mvnCMD} mvn install" 
        } else {
         bat "${mvnCMD} mvn install"
        }
    }


}
