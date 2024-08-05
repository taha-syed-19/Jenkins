# Jenkins Pipeline with Environment Variables

This repository contains a Jenkins pipeline that demonstrates the use of environment variables. The pipeline includes a stage that prints the values of predefined environment variables.

## Pipeline Overview

The pipeline is defined in the `Jenkinsfile` and includes:

- **Agent Declaration**: The pipeline can run on any available Jenkins agent.
- **Environment Variables**: Defines several environment variables.
- **Stages**: A single stage named "Demo" that prints the values of the environment variables.

## Environment Variables

1. **`myString`**:
   - **Type**: String
   - **Value**: `"Hello Syed"`

2. **`myNumber`**:
   - **Type**: Integer
   - **Value**: `10`

3. **`myBool`**:
   - **Type**: Boolean
   - **Value**: `true`

## Pipeline Behavior

- The pipeline prints the values of `myString`, `myNumber`, and `myBool` to the Jenkins console output.

## Usage

To use this pipeline, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/your-repo.git
