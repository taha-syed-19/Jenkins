def buildApp() {
    echo 'building the application based on server you selected'
}

def testApp() {
    echo 'Testing the App'
}

def deployApp() {
    echo 'Deploying the App'
    echo "Deploying version ${VERSION}"
}

return this
