# kotlin-training

### BUILD&RUN AUTOMATIC SCRIPT
#### STEP.1
```
$ ./build-run.sh kotlinc filename.kt
```

### BUILD&RUN MANUAL
#### STEP.1 BUILD
```
$ kotlinc filename.kt -include-runtime -d filename.jar
```

#### STEP.2 RUN
```
$ java -jar filename.jar
```
