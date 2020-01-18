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
     - *Bean instantiation with default Constructor*: ```<bean id="exampleBean" class="examples.ExampleBean"/>```
     - *Instantiation with a Static Factory Method*: ```<bean id="clientService" class="examples.ClientService" factory-method="createInstance"/>```
     - *Instantiation by Using an Instance Factory Method*: ```<bean id="clientService" factory-bean="serviceLocator"  factory-method="createClientServiceInstance"/>```
    - ### Dependency injection:
      - *Constructor based dependency injection*: 
       ``` 
        <bean id="beanOne" class="x.y.ThingOne">
             <constructor-arg ref="beanThree"/> // Passing reference 
             <constructor-arg type="int" value="7500000"/> // passing value 
             <constructor-arg type="java.lang.String" value="42"/>
             <constructor-arg index="0" value="7500000"/> // index based
             <constructor-arg name(/ref)="years" value="7500000"/> // passing by name/value
         </bean>
        ```
      - *Setter based dependency injection*: 
         ```
         <bean id="exampleBean" class="examples.ExampleBean">
              <property name="beanOne" ref="anotherExampleBean"/></property>
         </bean>     
          ```
   - ### Autowiring:
     - *byName*: Spring looks for a bean with the same name as the property that needs to be autowired.
     - *byType*: Lets a property be autowired if exactly one bean of the property type exists in the container.
     - *by constructor*: Analogous to byType but applies to constructor arguments. 
     - Exclude bean from autowiring - ```<bean autowire-candidate="false"></bean>```
     
   - ### Method injection:
     - **Lookup method injection**:
       - *Issue* - Bean A - Singleton, Bean B - Prototype, Bean B injected to Bean A. Hence Bean A will always hold one instance of Bean B.
       - *Solution 1* -  Injection expllicity using ```applicationContext.getBean()```
       - *Solution 2* - Use Method injection
         ``` 
          <bean id="pizzaShop" class="com.javarticles.spring.PizzaShop"> //Singleton
             <lookup-method name="makePizza" bean="pizza"/> // Singleton abstract method makePizza will generate pizza
             <lookup-method name="makeVeggiePizza" bean="veggiePizza"/>
          </bean>
         ```
   - ### Bean scopes
     1. **Singleton** : Only one bean available always when we do context.getBean().
     2. **Prototype**: Each time new instance available when we do context.getBean().
     3. **Request**: One bean per Web request.
     4. **Application**: One bean for entire web application.
     5. **Session**: One bean per session.
  
  - ### Customizing nature of bean:
     1. **Initialization callbacks**: 
         - **Bean implement ```InitializingBean`` and implement ```afterPropertiesSet```** : Called once bean's DI is complete. Not recommended as it binds code to Spring as you need to implement spring interface.
         - **Init method** : In the case of XML-based configuration metadata, you can use the init-method attribute to specify the name of the method that has a void no-argument signature. With Java configuration, you can use the initMethod attribute of @Bean.
         - **Annotation @PostConstruct**-  Using these annotations means that your beans are not coupled to Spring-specific interfaces
    
     
     
      
     
     
    
    

