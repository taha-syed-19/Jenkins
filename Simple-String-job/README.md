# Jenkins Pipeline with String Parameter

This repository contains a Jenkins pipeline that demonstrates the use of a string parameter. The pipeline includes a stage that prints the value of the string parameter to the console.

## Pipeline Overview

The pipeline is defined in the `Jenkinsfile` and includes:

- **Agent Declaration**: The pipeline can run on any available Jenkins agent.
- **Parameters**: A string parameter to specify the deployment environment.
- **Stages**: A single stage named "Demo" that prints the value of the string parameter.

## Parameters

1. **`deployEnv`**:
   - **Type**: String
   - **Description**: Specifies the environment to deploy in.
   - **Default Value**: `TEST`

## Pipeline Behavior

- The pipeline prints the value of the `deployEnv` parameter to the Jenkins console output.

## Usage

To use this pipeline, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/your-repo.git
