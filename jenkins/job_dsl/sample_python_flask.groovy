pipelineJob('sample-python-flask-pipeline') {
    description 'Deployment pipeline for sample-python-flask'
    keepDependencies false
    disabled false

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/viettienn/emptify.git')
                    }
                    branch('*/master')
                }
            }
            scriptPath 'sample-python-flask/Jenkinsfile'
        }
    }

    triggers {
        scm('* * * * *')
    }
}
