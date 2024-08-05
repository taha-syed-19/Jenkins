echo "# Jenkins Pipeline Example

This repository contains a simple Jenkins pipeline that demonstrates the use of a boolean parameter.

## Pipeline Overview

The pipeline is defined in the \`Jenkinsfile\` and consists of the following components:

- **Agent Declaration**: The pipeline can run on any available Jenkins agent.
- **Parameters**: A boolean parameter named \`myBoolean\` with a default value of \`false\` and a description \"Enable Service ?\".
- **Stages**: A single stage named \"Demo\" that prints the value of the \`myBoolean\` parameter to the console.

## Usage

To use this pipeline, follow these steps:

1. **Clone the Repository**: Clone this repository to your local machine or directly into your Jenkins server.
    \`\`\`bash
    git clone https://github.com/taha-syed-19/Jenkins.git
    \`\`\`
2. **Create a Jenkins Job**: Create a new Jenkins pipeline job and point it to the \`Jenkinsfile\` in this repository.
    - In the Jenkins job configuration, select \"Pipeline\" as the project type.
    - In the \"Pipeline\" section, choose \"Pipeline script from SCM\".
    - Select \"Git\" as the SCM and provide the repository URL.
    - Specify the branch if needed and set the \`Jenkinsfile\` path.

3. **Run the Pipeline**: Trigger the pipeline manually or set up a schedule or webhook for automatic triggers.

4. **Configure Parameters**: When running the pipeline, you will see a checkbox for the \`myBoolean\` parameter.
    - Leave it unchecked to use the default value (\`false\`).
    - Check it to set the value to \`true\`.

5. **Check Output**: The pipeline will print the value of the \`myBoolean\` parameter to the console output.
    - If the checkbox is unchecked, the output will be:
        \`\`\`
        booleanParam is set to: false
        \`\`\`
    - If the checkbox is checked, the output will be:
        \`\`\`
        booleanParam is set to: true
        \`\`\`

## Jenkinsfile

Here is the content of the \`Jenkinsfile\`:

\`\`\`groovy
pipeline {
    agent any

    parameters {
        booleanParam(defaultValue: false, description: \"Enable Service ?\", name: \"myBoolean\")
    }

    stages {
        stage(\"Demo\") {
            steps {
                echo \"booleanParam is set to: \${params.myBoolean}\"
            }
        }
    }
}
\`\`\`

## Contributing

Feel free to submit issues or pull requests if you have suggestions for improvements or additional features.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
" > README.md
