# Use the official Jenkins LTS image as a base
FROM jenkins/jenkins:lts

# Switch to root to install packages
USER root

# Install Groovy and other dependencies
RUN apt-get update && apt-get install -y groovy

# Switch back to the jenkins user
USER jenkins

