pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/GustavoFalcao/INF335-2023-Trabalho-CI'

                // Run Maven on a Unix agent.
                //sh "cd inf335-trabalho4; mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                 bat "cd inf335-trabalho4 & call mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/inf335-trabalho4/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'inf335-trabalho4/target/*.jar'
                }
            }
        }
    }
}
