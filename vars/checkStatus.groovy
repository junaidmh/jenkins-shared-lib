#!/usr/bin/env groovy

def call(body) {
    echo "Check status"

    (1..6).each {
        echo "Number: " + it
    }

    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}
