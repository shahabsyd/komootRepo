# UI Automation


## How to run


* Build the project

```
mvn clean package -DskipTests=true
```

* Pull browser images

    * Manually:
   
        - go to **config/browsers.json**
        - pull listed images: 
        
      ```
      docker pull selenoid/vnc:chrome_84.0
      ```
        
   * Or if you have **jq**:
    
        ```
        cat config/browsers.json | jq -r '..|.image?|strings' | xargs -I{} docker pull {}
        ```

* Run test 
```$bash
    docker-compose up --build
```

* See report

    1.  Generate report (First step)
    http://localhost:5050/allure-docker-service/generate-report
    
    2. See the latest report (Second step)
    http://localhost:5050/allure-docker-service/latest-report
     
     ** For more documentation check here
     https://github.com/fescobar/allure-docker-service

* See your running tests (only if VNC is enabled)

    http://localhost:8080

* Finish tests
```$bash
    docker-compose down
```

###How to change xml suite to run
 
Go to docker-compose.yml. Change **SUITE** variable:

> args:
>
> SUITE: test-suite.xml

### Next steps:
- video
- make configuration more convenient
- make dockerfile for dev to change project on a fly without recompiling



