# Spring

## Spring Core
  - https://docs.spring.io/spring/docs/5.2.4.BUILD-SNAPSHOT/spring-framework-reference/core.html#spring-core
  - **Dependency injection (IOC - Inversion of Control)**:
    - The dependecies of a class are not instantiated by class, but passed to the class either through constructor, setter or factory method bean injection.
    - The org.springframework.context.ApplicationContext interface represents the Spring IoC container and is responsible for instantiating, configuring, and assembling the beans.
    - The configuration metadata is represented in XML, Java annotations, or Java code.
    - The **ApplicationContext** is the interface for an advanced factory capable of maintaining a registry of different beans and their dependencies.
    - Instantiating container:``` ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");```
    - ```
      <beans>
        <import resource="services.xml"/>
        <import resource="resources/messageSource.xml"/>
        <import resource="/resources/themeSource.xml"/>

        <bean id="bean1" class="..."/>
        <bean id="bean2" class="..."/>
      </beans>
     ```
    
    - ### XML bean definition:
      - id: id is unique identifier of bean.
      - name: We can specify multiple comma separated names for a bean.
      - alias: Override bean with "name" with an existing bean with "name" alias.
        - ```<alias name="testDataSource" alias="dataSource"/>```
        - Bean aliasing allows us to override already configured beans and to substitute them with a different object definition.
   - ### Bean instantiation:
     - Bean instantiation with Constructor:
     
     
    
    

