def buildApp() {
    echo 'building the application based on server you selected'
}

def testApp() {
    echo 'Testing the App'
}

def deployApp(version) {
    echo 'Deploying the App'
    echo "Deploying version ${version}"
}

return this
