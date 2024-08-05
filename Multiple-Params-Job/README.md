# Jenkins Pipeline with Parameters

This repository contains a Jenkins pipeline that demonstrates the use of different types of parameters. The pipeline includes a string parameter, a choice parameter, and a boolean parameter, which are used to configure the deployment.

## Pipeline Overview

The pipeline is defined in the `Jenkinsfile` and includes:

- **Agent Declaration**: The pipeline can run on any available Jenkins agent.
- **Parameters**:
  - **String Parameter**: For specifying a deployment name.
  - **Choice Parameter**: For selecting an availability zone.
  - **Boolean Parameter**: For confirming deployment.

## Parameters

1. **`deployName`**:
   - **Type**: String
   - **Description**: The name of the deployment.
   - **Default Value**: An empty string.

2. **`azDeploy`**:
   - **Type**: Choice
   - **Description**: Availability zone for the deployment.
   - **Choices**:
     - `Eu-west-1a`
     - `Eu-west-1b`
     - `Eu-west-1c`
   - **Default Value**: The first value in the list (`Eu-west-1a`).

3. **`confirmDeploy`**:
   - **Type**: Boolean
   - **Description**: Confirmation to proceed with the deployment.
   - **Default Value**: `false`.

## Usage

To use this pipeline, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/your-repo.git
