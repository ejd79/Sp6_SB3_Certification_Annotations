# Sp6_SB3_Certification_Annotations

### Annotation Bean Configuration (Stereotype Annotation)
- Used to create Spring beans automatically in the Application context (Spring IoC container) 
- The main stereotype annotation is @Component

>By using @Component, Spring provides more Stereotype meta annotation, such as: @Service, @Repository, @Controller
- @Service is used Spring beans at the Service Layer
- @Repository is used to create Spring beans for the repositories at the DAO Layer
- @Controller is used to create Spring beans at the controller layer 

>@value is used: 
- to passing Default value to properties:  
    @Value("Default Name")
    private String defaultName;
- to read from **application.properties** files:  
  @Value("${mail.host}")
  private String host; 
- to read from **Environment** or **System Variable**  
  @Value("${java.home}")  
  private String java_home;  
  @Value("${HOME}")  
  private String homeDir;  

> @PropertySource and @PropertySources to provide properties file to Spring Environment
- is used with Configuration classes

> @ConfigurationProperties

### Java Bean Configuration
- The @Bean annotation tells Spring IoC Container to manage VegPizza object 
- Inject Bean Object 

