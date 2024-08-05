# Jenkins Pipeline for Simple Java Maven App

This Jenkins pipeline script automates the process of cleaning up the workspace, cloning a GitHub repository, building the application using Maven, running tests, and triggering another Jenkins job. Below is a step-by-step explanation of the pipeline stages.

## Pipeline Stages

1. **Clean Up**: Deletes the current workspace directory to ensure a fresh start for the build.
2. **Clone Repo**: Clones the `simple-java-maven-app` repository from GitHub.
3. **Build**: Navigates to the cloned repository directory and runs `mvn clean install` to build the application.
4. **Test**: Navigates to the cloned repository directory and runs `mvn test` to execute the tests.
5. **Build Remote**: Triggers another Jenkins job named `choicePipeline`.

## Prerequisites

- Jenkins installed and running.
- Maven installed on the Jenkins server.
- Git installed on the Jenkins server.

## Usage

1. Copy the `Jenkinsfile` to your repository.
2. Configure your Jenkins job to use the pipeline script from your repository.
3. Trigger the build from Jenkins.

## Repository Structure

