# Swagger CodeGen
Task2 : Kaiburr Task2

# Project Title

The project is about REST API implementation in Java and  using Swagger Codegen open-sorce generator to generate the SERVER STUB.It helps developers design, build, document, and consume RESTful web services at one go.The application provides a REST API with endpoints for searching,creating ,deleting and updating “server” objects. The variety of Software Platforms are available as a resource on the server side.The REST API together with documentation are created and client can request for a resource over this URL. 

## Getting Started

1.git clone https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED.git
### Prerequisites

* Downlaod Java version 1.8
* Downlaod SpringToolSuite version 4.6.0
* Downlaod Apache Tomcat Server 8.5
* Install Postman REST Client
* Downlaod Mongo Database 4.2.5

### Description

The server code is generated using swagger.yaml file created through Swagger Codegen.This code is integrated into Spring Framework using Swagger Codegen tool and then business logic is implemented in the generated framework.

* **Command Used for generating API code from swagger.yaml file :-**

 #cd swagger-codegen 

 #java -jar .\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar generate -i 'C:\Users\bharat\Downloads\swagger.yaml'  -o C:\Users\bharat\Desktop\server-flair1 -l spring     

* **The Swagger Editor looks like following and generates the documentation parallely for the written YAML code.**
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/1.swagger%20editor.PNG)
  

  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/2.swagger%20editor.PNG)
  
  

## Running the tests

* Run the mongod server at port 27017 using "mongod command"
* Run the server-flair1/src/main/java/io/swagger/api/PlatformsApi.java as JavaApplication.
* Open Browser and Hit localhost:8080
* Open Postman and send client request to REST API.

### Break down into end to end tests

* **Now Swagger is ready to generate documentation together with REST API.Verify that Swagger is running by creating a request to
  http://localhost:8080**
  
* **The above request will be redirected automatically to http://localhost:8080/swagger-ui.html#/platform**
  
  The following page will be displayed:-
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/3.%20swagger%20home%20page.PNG)
  
  
  
 * **  The platform details and description of each url and object fields is shown.The error and response code description is also present together with each URL.The HTTP requests GET,POST,PUT,DELETE can also be made over the resouce and following results are displayed.**
  
 
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/4.Swagger%20CRUD%20Operation.png)
  
  
  
  * **Using POSTMAN as REST Client to interact with Swagger UI with following ways-:**

* **Find all platforms available.[GET Request]**

![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/5.GET.PNG)

* **Create a platform by mentioning platform object details.[POST Request]**

  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/6.Post%20Input.PNG)
  

  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/7.Post%20output.PNG)

* **Find a Platform by mentioning Id in URL[GET Request]**

  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/13.get%20by%20id.PNG)
 
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/14.get%20by%20id%20output.PNG)
  
 * **Returns an error as response if platform with given id is not present in list.[Error Code and Message is displayed]**
 
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/15.get%20by%20id%20error.PNG)
  
* **Find a platform by mentioning name in URL[GET Request]**

   Get a single/list of platform as output . 
  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/10.get%20by%20name%20Input.PNG)
 
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/11.get%20by%20name%20output.PNG)
  
 

* **Returns an error as response if platform with given name is not present in list[GET Request],Error Code and Message is displayed**
 
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/12.get%20by%20name%20error.PNG)
 
* **Update a platform with given details [PUT]**
  
 Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/8.Put%20input.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/9.Put%20output.PNG)
  
* **Delete a platform with given Id. [DELETE]**
  
  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/17.Delete.PNG)
 
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/18.Delete%20output.PNG)
  
  * **Returns an error as response if platform with given details is not present in list[DELETE Request],Error Code and Message is displayed**
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/19.Delete%20error.PNG)
  
  * **Collection in a Mongo Database**
   
     ![](https://github.com/bharatprakashparakh/Kaiburr-Task2-UPDATED/blob/master/Images%20Task2/20.Mongo%20Database.PNG)
  

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* Swagger Codegen


## Contributing

Contributions are welcome.

 ## Author

* **Bharat Prakash Parakh** 



