# Jenkins Pipeline for Environment Deployment

This repository contains a Jenkins pipeline that allows selecting an environment for deployment using a choice parameter.

## Pipeline Overview

The pipeline is defined in the `Jenkinsfile` and includes:

- **Agent Declaration**: The pipeline can run on any available Jenkins agent.
- **Parameters**: A choice parameter named `deployEnv` that lets you select the environment to deploy.
- **Stages**: A single stage named "Demo" that prints the selected environment to the console.

## Pipeline Parameter

- **`deployEnv`**: 
  - **Type**: Choice
  - **Description**: Which environment to deploy in.
  - **Choices**:
    - `TEST`
    - `Dev`
    - `QA`
    - `Pre-Prod`
    - `Prod`
  - **Default**: The first value in the list (`TEST`).

## Usage

To use this pipeline, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/taha-syed-19/Jenkins.git
