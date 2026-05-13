# HomeLab-Jenkins

This repo is home to the [JobDSL](https://plugins.jenkins.io/job-dsl/) and [shared libraries](https://www.jenkins.io/doc/book/pipeline/shared-libraries/) that make up my homelab's Jenkins instance.

Its directory structure mostly follows the official standard:

## `jobs/`

Files in here are read by the instance's seed job and are intended to create jobs and folders across the instance.

This is referred to as "JobDSL".

## `vars/`

Files in here are treated as shared libraries. They become available for all jobs in the instance to reference, provided they are structured like so:

`vars/myExampleFunction.groovy`:
```groovy
def call() {
  sh 'echo Hello world'
}
```

This then becomes reachable by calling its filename (minus the extension) as a function:

```groovy
myExampleFunction()
```

Parameters are supported the same way they would be anywhere else in Groovy.
