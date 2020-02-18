node{
    stage('SCM Checkout'){
        git 'https://github.com/Nikhil12894/test123'
    }
    
    stage('Compile-Package'){
        def os = System.properties['os.name'].toLowerCase()
        echo "OS: ${os}"
        if (os.contains("linux")) {
         sh "mvn install" 
        } else {
         bat "mvn install"
        }
    }


}
