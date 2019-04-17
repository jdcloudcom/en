Use Go language environment construction and the example of build.yml is as follows

  ```
  cmds:
    - name: 'Specify working space'
      cmd: 'export GOPATH=$(pwd)'
    - name: 'Create the folder of construction package to be uploaded'
      cmd: 'mkdir -p output'
    - name: 'Construction Command'
      cmd: 'go install demo'
    - name: 'Copy generated construction results from GOPATH/bin'
      cmd: 'cp -rf bin output'

  # The compilation product storage directory is the required item
  out_dir: 'output'

  ```
