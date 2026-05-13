def call() {
  return '''
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: nodejs
    image: node:18-slim
    command:
    - cat
    tty: true
'''
}
