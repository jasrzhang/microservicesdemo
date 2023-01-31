# Microservices Artitecture (MSA) Overview
Study Micro Services. Thanks for Udacity learining content
N-Tier and monolithic applications used to be the de facto standard. In one single binary web artifact, like an EAR or WAR file, there would be a layered architecture with the decomposition of code into more functional components.

Presentation Layer
Business Process Layer/Service Layer
Data Access Layer

MSA is very flexible because it supports any language that can communicate via a RESTful endpoint and leverages REST over HTTP.
MSA offers agility and systems that are easier to write, test, deploy, and share.
MSA provides systems that can better scale to load and demand.
MSA provides systems that are resilient because failures are isolated and don’t cascade through the infrastructure.

A micorservice must register itself with a discovery service. e.g Eureka developped by Netflix. 

The case study is an online ordering service. There are multiple services that work together to create the system.

Item Service
Order Service
Shipping Service
