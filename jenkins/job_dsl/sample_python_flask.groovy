pipelineJob('sample-python-flask-pipeline') {
    description 'Deployment pipeline for sample-python-flask'
    keepDependencies false
    disabled false

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('git@github.com:viettienn/emptify.git')
                    }
                    branch('*/master')
                }
            }
            scriptPath 'jenkins/jenkinsfiles/sample_python_flask.Jenkinsfile'
        }
    }
}
