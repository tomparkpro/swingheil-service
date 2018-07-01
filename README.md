<a href="fb.me/swingheilapp/">
    <img src="https://t1.daumcdn.net/cfile/tistory/99CEF04C5B3066E235" alt="SwingHeil Logo" title="SwingHeil" align="right" height="60" />
</a>

swingheil-service library
======================

The swingheil-service has core service logic for SwingHeil and used by [swingheil-web-app](https://github.com/tomparkpro/swingheil-web-app) and [swingheil-rest-api](https://github.com/tomparkpro/swingheil-rest-api) projects.

[![SwingHeil App Banner](https://t1.daumcdn.net/cfile/tistory/9912074C5B3066E107)](https://github.com/tomparkpro/swingheil-service/)

## Table of content

- [Installation](#installation)
    - [Upload Bintray](#upload-to-bintray)
- [Techlonogy](#technology)
- [Development RoadMap](#development-roadmap)
- [License](#license)
- [Links](#links)

## Installation

The SwingHeil Service project uses Lombok library, so after import the project, 
please check "Enable annotation processing" from IntelliJ Preferences.

(IntelliJ Preferences => Build, Excution, Deployment => Compiler => Annotation Processors)


### Upload to Bintray

./gradlew clean build bintrayUpload --info


## Technology

- Spring Boot, JPA, Java 8, Java EE, Hibernate, gradle, yml, Heroku, MySQL, JCenter, Bintray


## Development RoadMap

- [x] initial setup springboot project
- [x] add JPA feature
- [x] add Query DSL feature
- [x] add simple testcase for service
- [x] upload jar to Bintray
- [ ] update event model and service
- [ ] add member feature


## License

The swingheil-service is licensed under the terms of the GPL Open Source
license and is available for free.


## Links

* [Facebook page](https://www.facebook.com/swingheilapp)
* [Issue tracker](https://github.com/tomparkpro/swingheil-service/issues)
* [Source code](https://github.com/tomparkpro/swingheil-service)

