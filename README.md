# ms-email

Microservice API that sends email.

### Reference Documentation

#### Endpoints

* **[POST] /sending-email**

To send an email.

Sending body reference:

```yaml
{
"ownerRef": "Your name",
"emailFrom": "your.name@mail.com",
"emailTo": "your.receiver@mail.com",
"subject": "Subject of your message",
"text": "Your message"
}
```

* **[GET] /emails**

To get a list of all emails sent, independently of status of the email.

* **[GET] /emails/{_emailId_}**

To get a single email based on the ID.

>**_emailId_** -> the ID of the desired email.


For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#io.validation)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#io.email)
