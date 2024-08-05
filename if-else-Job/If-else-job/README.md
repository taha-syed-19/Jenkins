# Jenkins Pipeline with Boolean Parameter

This repository contains a Jenkins pipeline that demonstrates the use of a boolean parameter. The pipeline includes a stage that evaluates the boolean parameter and performs actions based on its value.

## Pipeline Overview

The pipeline is defined in the `Jenkinsfile` and includes:

- **Agent Declaration**: The pipeline can run on any available Jenkins agent.
- **Parameters**: A boolean parameter to control the execution flow.
- **Stages**: A single stage named "Demo" that evaluates the boolean parameter and prints a message or terminates the build based on its value.

## Parameters

1. **`myBoolean`**:
   - **Type**: Boolean
   - **Description**: Determines whether to enable the service.
   - **Default Value**: `false`

## Pipeline Behavior

1. **When `myBoolean` is `false`**:
   - The pipeline sets the build result to "SUCCESS" and terminates the execution of the stage.

2. **When `myBoolean` is `true`**:
   - The pipeline prints the message `booleanParam is set to: TRUE` to the Jenkins console.

## Usage

To use this pipeline, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/your-repo.git
